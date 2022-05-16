package net.javaguides.springboot.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.model.Feedback;
import net.javaguides.springboot.repository.FeedbackRepository;

@Service

public class FeedBackServiceImpl implements FeedbackService {

	@Autowired
	private FeedbackRepository feedbackRepository;

	@Override
	public void saveFeedback(Feedback feedback) {
		this.feedbackRepository.save(feedback);
	}

	@Override

	public Feedback getEmployeeFeedbackById(long id) {
		Optional<Feedback> optional = feedbackRepository.findById(id);
		Feedback feedback = null;
		if (optional.isPresent()) {
			feedback = optional.get();
		} else {
			throw new RuntimeException(" Employee Techincalfeedback not found for id :: " + id);
		}
		return feedback;
	}

	@Override

	public void deleteEmployeeFeedbackById(long id) {
		this.feedbackRepository.deleteById(id);
	}

	@Override
	public Page<Feedback> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
		Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending()
				: Sort.by(sortField).descending();

		Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);
		return this.feedbackRepository.findAll(pageable);
	}

	public List<Feedback> getAllFeedbacks() {
		List<Feedback> feedbacklist = (List<Feedback>) feedbackRepository.findAll();
		return feedbacklist;
	}

	public List<Feedback> getByKeyword(String keyword) {
		return feedbackRepository.findByKeyword(keyword);
	}

}
