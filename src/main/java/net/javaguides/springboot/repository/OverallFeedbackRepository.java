package net.javaguides.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import net.javaguides.springboot.model.OverallFeedback;
@Repository
public interface OverallFeedbackRepository extends JpaRepository<OverallFeedback, Long>{  

	@Query(value = "select * from overall_feedback o where o.candidatename like %:keyword% or o.job_title like %:keyword%", nativeQuery = true)
	List<OverallFeedback> findByKeyword(@Param("keyword") String keyword);

	
}





	
