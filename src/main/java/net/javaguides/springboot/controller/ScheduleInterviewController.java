package net.javaguides.springboot.controller;

import java.util.List;

import javax.mail.internet.MimeMessage;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import net.javaguides.springboot.model.OverallFeedback;
import net.javaguides.springboot.model.ScheduleInterview;
import net.javaguides.springboot.repository.ScheduleInterviewRepository;
import net.javaguides.springboot.service.OverallFeedbackService;
import net.javaguides.springboot.service.ScheduleInterviewService;

@Controller
public class ScheduleInterviewController {

	@Autowired
	private ScheduleInterviewService scheduleinterviewservice;


	 @Autowired
	
	ScheduleInterviewRepository scheduleInterviewRepo;
	
	@Autowired
	private JavaMailSender mailSenderObj;

	@GetMapping("/schedule1")
	public String welcome() {

		return "welcome";
	}
	
	
	// display scheduled interviews
	@GetMapping("/check")
	public String viewScheduledInterviewPage(Model model) {
		return findPaginated(1, "candidatename", "asc", model);
	}

	@GetMapping("/add")
	public String addScheduleInterview() {

		return "schedule_interview1";
	}

	@RequestMapping(value = "/saveScheduleInterview", method = RequestMethod.POST)
	public String addScheduleInterview(ModelMap model, @Valid ScheduleInterview scheduleinterview) {
		scheduleInterviewRepo.save(scheduleinterview);

		// send mail method call
		sendmail(scheduleinterview);
		return "redirect:/success";

	}

	@GetMapping("/success")
	public String success() {

		return "success";
	}

	// java send mail code
	private void sendmail(@Valid ScheduleInterview scheduleinterview) {
		final String emailToRecipient = scheduleinterview.getEmp_email();

		final String emailSubject = "Your application is sucessfully registered with Ingrain Systems Private  Limited";
		final String emailMessage1 = "<html> <body> <p>Dear Sir/Madam,</p><p>\r\n"
				+ "Thank you for applying to Ingrain Systems.\r\n"
				+ "\r\n"
				+ "Your application for the applied position stood out to us and interview is scheduled to you as per the given details below."
				+ "Please call me at 9182052442 or email me at sumankumar@ingrain.us if you have any questions or need to reschedule.\r\n"
				+ "\r\n"
				+ "<br><br>"
				+ "Sincerely,\r\n"
				+ "\r\n"
				+ "Suman Kumar"
				+ "<br><br>"
				+ "Ingrain Systems Inc"
				+ "<br><br>"
				+ "<table border='1' width='300px' style='text-align:center;font-size:14px;'><tr> <td colspan='2'>"
				+ "</td></tr><tr><td>Name</td><td>" + scheduleinterview.getCandidatename()
				+ "</td></tr><tr><td>Address</td><td>" + scheduleinterview.getEmp_address()
				+ "</td></tr><tr><td>Email</td><td>" + scheduleinterview.getEmp_email()

				+ "</td></tr><tr><td>JobTitle</td><td>" + scheduleinterview.getJobTitle()
				+ "</td></tr><tr><td>InterviewType</td><td>" + scheduleinterview.getInterviewType()
				+ "</td></tr><tr><td>InterviewerName</td><td>" + scheduleinterview.getInterviewerName()
				+ "</td></tr><tr><td>Stages</td><td>" + scheduleinterview.getStages()
				+ "</td></tr><tr><td>InterviewDate</td><td>" + scheduleinterview.getInterviewDate()
				+ "</td></tr><tr><td>InterviewTime</td><td>" + scheduleinterview.getInterviewTime()
				+ "</td></tr><tr><td>InterviewDuration</td><td>" + scheduleinterview.getInterviewDuration()
				+ "</td></tr><tr><td>Notes</td><td>" + scheduleinterview.getNotes()
				+ "</td></tr></table> </body></html>";

		mailSenderObj.send(new MimeMessagePreparator() {
			public void prepare(MimeMessage mimeMessage) throws Exception {

				MimeMessageHelper mimeMsgHelperObj = new MimeMessageHelper(mimeMessage, true, "UTF-8");
				mimeMsgHelperObj.setTo(emailToRecipient);

				mimeMsgHelperObj.setText(emailMessage1, true);

				mimeMsgHelperObj.setSubject(emailSubject);
			}
		});
		
	}
	@GetMapping("/page5/{pageNo}")
	public String findPaginated(@PathVariable(value = "pageNo") int pageNo, @RequestParam("sortField") String sortField,
			@RequestParam("sortDir") String sortDir, Model model) {
		int pageSize = 5;

		Page<ScheduleInterview> page = scheduleinterviewservice.findPaginated(pageNo, pageSize, sortField, sortDir);
		List<ScheduleInterview> scheduledinterview = page.getContent();

		model.addAttribute("currentPage", pageNo);
		model.addAttribute("totalPages", page.getTotalPages());
		model.addAttribute("totalItems", page.getTotalElements());

		model.addAttribute("sortField", sortField);
		model.addAttribute("sortDir", sortDir);
		model.addAttribute("reverseSortDir", sortDir.equals("asc") ? "desc" : "asc");

		model.addAttribute("scheduledinterview", scheduledinterview);
		return "view_schedule";

	}


}
