package net.javaguides.springboot.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import net.javaguides.springboot.model.Doc;
import net.javaguides.springboot.service.DocStorageService;

@Controller
public class DocController {

	@Autowired
	private DocStorageService docStorageService;

	@GetMapping("/doct")
	public String get(Model model) {
		List<Doc> docs = docStorageService.getFiles();
		model.addAttribute("docs", docs);
		return "doc";

	}

	@GetMapping("/deleteDoc/{id}")
	public String deleteDoc(@PathVariable(value = "id") Integer id) {

		// call delete attachment method
		this.docStorageService.deleteDocById(id);
		return "redirect:/doct1";
	}

	@GetMapping("/doct1")
	public String get1(Model model) {
		List<Doc> docs = docStorageService.getFiles();
		model.addAttribute("docs", docs);
		return "doc1";
	}

	public String message() {
		return "message";
	}

	@PostMapping("/uploadFiles")
	public String uploadMultipleFiles(@RequestParam("files") MultipartFile[] files,
			RedirectAttributes redirectAttributes) {
		try {
			for (MultipartFile file : files) {
				docStorageService.saveFile(file);
				redirectAttributes.addFlashAttribute("message",
						"You successfully uploaded " + file.getOriginalFilename() + "!");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return "redirect:/doct";

	}

	@GetMapping("/downloadFile/{fileId}")
	public ResponseEntity<ByteArrayResource> downloadFile(@PathVariable Integer fileId) {
		Doc doc = docStorageService.getFile(fileId).get();
		return ResponseEntity.ok().contentType(MediaType.parseMediaType(doc.getDocType()))
				.header(HttpHeaders.CONTENT_DISPOSITION, "attachment:filename=\"" + doc.getDocName() + "\"")
				.body(new ByteArrayResource(doc.getData()));
	}

}
