package net.javaguides.springboot.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import net.javaguides.springboot.model.Feedback1;
import net.javaguides.springboot.service.Feedback1Service;

@Controller

public class Feedback1Controller {

	@Autowired
	private Feedback1Service feedback1Service;

	// display list of employees
	@GetMapping("/Home1")
	public String viewHomePage(Model model) {
		return findPaginated(1, "id", "asc", model);
	}

	// ui code for add candidate backnd code
//@GetMapping("/showNewEmployeeForm")
	@GetMapping("/showNewFeedbackForm1")
	public String showNewEmployeeForm(Model model) {
		// create model attribute to bind form data
		Feedback1 feedback1 = new Feedback1();
		model.addAttribute("feedback1", feedback1);
		return "new_feedback1";
	}

	/// BACKEND DATA FOR VIEW APPLICATION

	@GetMapping("/viewfeedback1/{id}")
	public String viewPage(@PathVariable(value = "id") long id, Model model) {
		model.addAttribute("listApplicants", feedback1Service.getEmployeeFeedbackById(id));
		return "view_application2";

	}

	@PostMapping("/saveFeedback1")
	public String saveFeedback(@ModelAttribute("feedback1") Feedback1 feedback1) {
		// save employee to database
		feedback1Service.saveFeedback(feedback1);
		return "redirect:/Home1";
	}

	@GetMapping("/showFormForUpdate2/{id}")
	public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {

		// get employee from the service
		Feedback1 feedback1 = feedback1Service.getEmployeeFeedbackById(id);

		// set employee as a model attribute to pre-populate the form
		model.addAttribute("feedback1", feedback1);
		return "update_feedback1";
	}

	@GetMapping("/deleteEmployeeFeedback1/{id}")
	public String deleteEmployeeFeedback(@PathVariable(value = "id") long id) {

		// call delete employee method
		this.feedback1Service.deleteEmployeeFeedbackById(id);
		return "redirect:/Home1";
	}

	@RequestMapping(path = { "/searchHrFeedback" })
	public String home(Feedback1 feedback1, Model model, String keyword) {
		if (keyword != null) {
			List<Feedback1> feedbacklist1 = feedback1Service.getByKeyword(keyword);
			model.addAttribute("feedbacklist1", feedbacklist1);
		} else {
			List<Feedback1> feedbacklist1 = feedback1Service.getAllFeedbacks();
			model.addAttribute("feedbacklist1", feedbacklist1);
		}
		return "Index2";
	}

	@GetMapping("/page3/{pageNo}")
	public String findPaginated(@PathVariable(value = "pageNo") int pageNo, @RequestParam("sortField") String sortField,
			@RequestParam("sortDir") String sortDir, Model model) {
		int pageSize = 5;

		Page<Feedback1> page = feedback1Service.findPaginated(pageNo, pageSize, sortField, sortDir);
		List<Feedback1> feedbacklist1 = page.getContent();

		model.addAttribute("currentPage", pageNo);
		model.addAttribute("totalPages", page.getTotalPages());
		model.addAttribute("totalItems", page.getTotalElements());

		model.addAttribute("sortField", sortField);
		model.addAttribute("sortDir", sortDir);
		model.addAttribute("reverseSortDir", sortDir.equals("asc") ? "desc" : "asc");

		model.addAttribute("feedbacklist1", feedbacklist1);
		return "Index2";

	}
}