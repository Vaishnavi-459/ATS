package net.javaguides.springboot.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "HRFeedback")

public class Feedback1 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "Candidatename")
	private String CandidateName;

	@Column(name = "JobTitle")
	private String jobtitle;

	@Column(name = "InterviewerName")
	private String InterviewerName;
	@Column(name = "Evaluationarea")
	private String evaluationarea;
	@Column(name = "Notes")
	private String notes;
	@Column(name = "skillArea")
	private String skillarea;
	@Column(name = "Rating")
	private int rating;
	@Column(name = "Evaluationarea1")
	private String evaluationarea1;
	@Column(name = "Notes1")
	private String notes1;
	@Column(name = "skillArea1")
	private String skillarea1;
	@Column(name = "Rating1")
	private int rating1;
	@Column(name = "Evaluationarea2")
	private String evaluationarea2;
	@Column(name = "Notes2")
	private String notes2;
	@Column(name = "skillArea2")
	private String skillarea2;
	@Column(name = "Rating2")
	private int rating2;
	@Column(name = "Evaluationarea3")
	private String evaluationarea3;
	@Column(name = "Notes3")
	private String notes3;
	@Column(name = "skillArea3")
	private String skillarea3;
	@Column(name = "Rating3")
	private int rating3;
	@Column(name = "Evaluationarea4")
	private String evaluationarea4;
	@Column(name = "Notes4")
	private String notes4;
	@Column(name = "skillArea4")
	private String skillarea4;
	@Column(name = "Rating4")
	private int rating4;
	@Column(name = "Evaluationarea5")
	private String evaluationarea5;

	@Column(name = "Notes5")
	private String notes5;
	@Column(name = "skillArea5")
	private String skillarea5;
	@Column(name = "Rating5")
	private int rating5;
	@Column(name = "overallRating")
	private int overallrating;
	@Column(name = "Result")
	private String result;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCandidateName() {
		return CandidateName;
	}

	public void setCandidateName(String candidateName) {
		CandidateName = candidateName;
	}

	public String getJobtitle() {
		return jobtitle;
	}

	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}

	public String getInterviewerName() {
		return InterviewerName;
	}

	public void setInterviewerName(String interviewerName) {
		InterviewerName = interviewerName;
	}

	public String getEvaluationarea() {
		return evaluationarea;
	}

	public void setEvaluationarea(String evaluationarea) {
		this.evaluationarea = evaluationarea;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getSkillarea() {
		return skillarea;
	}

	public void setSkillarea(String skillarea) {
		this.skillarea = skillarea;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getEvaluationarea1() {
		return evaluationarea1;
	}

	public void setEvaluationarea1(String evaluationarea1) {
		this.evaluationarea1 = evaluationarea1;
	}

	public String getNotes1() {
		return notes1;
	}

	public void setNotes1(String notes1) {
		this.notes1 = notes1;
	}

	public String getSkillarea1() {
		return skillarea1;
	}

	public void setSkillarea1(String skillarea1) {
		this.skillarea1 = skillarea1;
	}

	public int getRating1() {
		return rating1;
	}

	public void setRating1(int rating1) {
		this.rating1 = rating1;
	}

	public String getEvaluationarea2() {
		return evaluationarea2;
	}

	public void setEvaluationarea2(String evaluationarea2) {
		this.evaluationarea2 = evaluationarea2;
	}

	public String getNotes2() {
		return notes2;
	}

	public void setNotes2(String notes2) {
		this.notes2 = notes2;
	}

	public String getSkillarea2() {
		return skillarea2;
	}

	public void setSkillarea2(String skillarea2) {
		this.skillarea2 = skillarea2;
	}

	public int getRating2() {
		return rating2;
	}

	public void setRating2(int rating2) {
		this.rating2 = rating2;
	}

	public String getEvaluationarea3() {
		return evaluationarea3;
	}

	public void setEvaluationarea3(String evaluationarea3) {
		this.evaluationarea3 = evaluationarea3;
	}

	public String getNotes3() {
		return notes3;
	}

	public void setNotes3(String notes3) {
		this.notes3 = notes3;
	}

	public String getSkillarea3() {
		return skillarea3;
	}

	public void setSkillarea3(String skillarea3) {
		this.skillarea3 = skillarea3;
	}

	public int getRating3() {
		return rating3;
	}

	public void setRating3(int rating3) {
		this.rating3 = rating3;
	}

	public String getEvaluationarea4() {
		return evaluationarea4;
	}

	public void setEvaluationarea4(String evaluationarea4) {
		this.evaluationarea4 = evaluationarea4;
	}

	public String getNotes4() {
		return notes4;
	}

	public void setNotes4(String notes4) {
		this.notes4 = notes4;
	}

	public String getSkillarea4() {
		return skillarea4;
	}

	public void setSkillarea4(String skillarea4) {
		this.skillarea4 = skillarea4;
	}

	public int getRating4() {
		return rating4;
	}

	public void setRating4(int rating4) {
		this.rating4 = rating4;
	}

	public String getEvaluationarea5() {
		return evaluationarea5;
	}

	public void setEvaluationarea5(String evaluationarea5) {
		this.evaluationarea5 = evaluationarea5;
	}

	public String getNotes5() {
		return notes5;
	}

	public void setNotes5(String notes5) {
		this.notes5 = notes5;
	}

	public String getSkillarea5() {
		return skillarea5;
	}

	public void setSkillarea5(String skillarea5) {
		this.skillarea5 = skillarea5;
	}

	public int getRating5() {
		return rating5;
	}

	public void setRating5(int rating5) {
		this.rating5 = rating5;
	}

	public int getOverallrating() {
		return overallrating;
	}

	public void setOverallrating(int overallrating) {
		this.overallrating = overallrating;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "Feedback1 [id=" + id + ", CandidateName=" + CandidateName + ", jobtitle=" + jobtitle
				+ ", InterviewerName=" + InterviewerName + ", evaluationarea=" + evaluationarea + ", notes=" + notes
				+ ", skillarea=" + skillarea + ", rating=" + rating + ", evaluationarea1=" + evaluationarea1
				+ ", notes1=" + notes1 + ", skillarea1=" + skillarea1 + ", rating1=" + rating1 + ", evaluationarea2="
				+ evaluationarea2 + ", notes2=" + notes2 + ", skillarea2=" + skillarea2 + ", rating2=" + rating2
				+ ", evaluationarea3=" + evaluationarea3 + ", notes3=" + notes3 + ", skillarea3=" + skillarea3
				+ ", rating3=" + rating3 + ", evaluationarea4=" + evaluationarea4 + ", notes4=" + notes4
				+ ", skillarea4=" + skillarea4 + ", rating4=" + rating4 + ", evaluationarea5=" + evaluationarea5
				+ ", notes5=" + notes5 + ", skillarea5=" + skillarea5 + ", rating5=" + rating5 + ", overallrating="
				+ overallrating + ", result=" + result + "]";
	}

}