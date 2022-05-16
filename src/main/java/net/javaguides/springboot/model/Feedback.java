package net.javaguides.springboot.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TechincalFeedback")

public class Feedback {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "Candidatename")
	private String CandidateName;
	@Column(name = "JobTitle")
	private String jobtitle;
	@Column(name = "Interviewer_Name")
	private String InterviewerName;
	@Column(name = "PrimarySkills")
	private String primaryskills;
	@Column(name = "skillarea")
	private String skillarea;
	@Column(name = "Notes")
	private String notes;
	@Column(name = "rating")
	private int rating;
	@Column(name = "SecondarySkills")
	private String secondaryskills;
	@Column(name = "skillarea1")
	private String skillarea1;
	@Column(name = "Notes1")
	private String notes1;
	@Column(name = "rating1")
	private int rating1;
	@Column(name = "AdditionalSkills")
	private String additionalskills;
	@Column(name = "skillarea2")
	private String skillarea2;
	@Column(name = "Notes2")
	private String notes2;
	@Column(name = "rating2")
	private int rating2;
	@Column(name = "overallRating")
	private int overallRating;
	@Column(name = "Result")
	private String Result;

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

	public String getPrimaryskills() {
		return primaryskills;
	}

	public void setPrimaryskills(String primaryskills) {
		this.primaryskills = primaryskills;
	}

	public String getSkillarea() {
		return skillarea;
	}

	public void setSkillarea(String skillarea) {
		this.skillarea = skillarea;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getSecondaryskills() {
		return secondaryskills;
	}

	public void setSecondaryskills(String secondaryskills) {
		this.secondaryskills = secondaryskills;
	}

	public String getSkillarea1() {
		return skillarea1;
	}

	public void setSkillarea1(String skillarea1) {
		this.skillarea1 = skillarea1;
	}

	public String getNotes1() {
		return notes1;
	}

	public void setNotes1(String notes1) {
		this.notes1 = notes1;
	}

	public int getRating1() {
		return rating1;
	}

	public void setRating1(int rating1) {
		this.rating1 = rating1;
	}

	public String getAdditionalskills() {
		return additionalskills;
	}

	public void setAdditionalskills(String additionalskills) {
		this.additionalskills = additionalskills;
	}

	public String getSkillarea2() {
		return skillarea2;
	}

	public void setSkillarea2(String skillarea2) {
		this.skillarea2 = skillarea2;
	}

	public String getNotes2() {
		return notes2;
	}

	public void setNotes2(String notes2) {
		this.notes2 = notes2;
	}

	public int getRating2() {
		return rating2;
	}

	public void setRating2(int rating2) {
		this.rating2 = rating2;
	}

	public int getOverallRating() {
		return overallRating;
	}

	public void setOverallRating(int overallRating) {
		this.overallRating = overallRating;
	}

	public String getResult() {
		return Result;
	}

	public void setResult(String result) {
		Result = result;
	}

	@Override
	public String toString() {
		return "Feedback [id=" + id + ", CandidateName=" + CandidateName + ", jobtitle=" + jobtitle
				+ ", InterviewerName=" + InterviewerName + ", primaryskills=" + primaryskills + ", skillarea="
				+ skillarea + ", notes=" + notes + ", rating=" + rating + ", secondaryskills=" + secondaryskills
				+ ", skillarea1=" + skillarea1 + ", notes1=" + notes1 + ", rating1=" + rating1 + ", additionalskills="
				+ additionalskills + ", skillarea2=" + skillarea2 + ", notes2=" + notes2 + ", rating2=" + rating2
				+ ", overallRating=" + overallRating + ", Result=" + Result + "]";
	}

	public Feedback() {
		// TODO Auto-generated constructor stub
	}

}
