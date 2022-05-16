package net.javaguides.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.model.Feedback;




@Repository

public interface FeedbackRepository extends JpaRepository<Feedback, Long>{
	
	
	
	@Query(value = "select * from techincal_feedback tf where tf.candidatename like %:keyword% or tf.interviewer_name like %:keyword% or tf.job_title like %:keyword%", nativeQuery = true)
	List<Feedback> findByKeyword(@Param("keyword") String keyword);
}

	
