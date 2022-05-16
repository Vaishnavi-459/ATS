package net.javaguides.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import net.javaguides.springboot.model.Feedback1;




@Repository

public interface Feedback1Repository extends JpaRepository<Feedback1, Long>{
	
	@Query(value = "select * from hrfeedback hf where hf.candidatename like %:keyword% or hf.interviewer_name like %:keyword% or hf.job_title like %:keyword%", nativeQuery = true)
	List<Feedback1> findByKeyword(@Param("keyword") String keyword);

}