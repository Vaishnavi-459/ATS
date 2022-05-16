package net.javaguides.springboot.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.data.domain.Page;


import net.javaguides.springboot.model.ScheduleInterview;

public interface ScheduleInterviewService {

	List<ScheduleInterview> getAllInterviewDetails();
	ScheduleInterview getInterviewDetailsById(long id);
	Page<ScheduleInterview> findPaginated(int pageNo, int pageSize, String sortField, String sortDir);

	ScheduleInterview getScheduleInterviewById(long id);
	void saveScheduleInterview(ScheduleInterview scheduleinterview);

}
