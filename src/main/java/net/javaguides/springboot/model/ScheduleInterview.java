package net.javaguides.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "scheduleinterview")
public class ScheduleInterview {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	
	@Column(name = "candidatename")
	private String candidatename;
	@Column(name = "emp_address")
	private String emp_address;
	@Column(name = "emp_email")
	private String emp_email;
	@Column(name = "jobTitle")
	private String jobTitle;
	@Column(name = "interviewType")
	private String interviewType;
	@Column(name = "interviewerName")
	private String interviewerName;
	@Column(name = " stages")
	private String stages;
	@Column(name = "interviewDate")
	private String interviewDate;
	@Column(name = "interviewTime")
	private String interviewTime;
	@Column(name = "interviewDuration")
	private String interviewDuration;
	@Column(name = "notes")
	private String notes;

	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

	public String getEmp_address() {
		return emp_address;
	}

	public void setEmp_address(String emp_address) {
		this.emp_address = emp_address;
	}

	public String getEmp_email() {
		return emp_email;
	}

	public void setEmp_email(String emp_email) {
		this.emp_email = emp_email;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getInterviewType() {
		return interviewType;
	}

	public void setInterviewType(String interviewType) {
		this.interviewType = interviewType;
	}

	public String getInterviewerName() {
		return interviewerName;
	}

	public void setInterviewerName(String interviewerName) {
		this.interviewerName = interviewerName;
	}

	public String getStages() {
		return stages;
	}

	public void setStages(String stages) {
		this.stages = stages;
	}

	public String getInterviewDate() {
		return interviewDate;
	}

	public void setInterviewDate(String interviewDate) {
		this.interviewDate = interviewDate;
	}

	public String getInterviewTime() {
		return interviewTime;
	}

	public void setInterviewTime(String interviewTime) {
		this.interviewTime = interviewTime;
	}

	public String getInterviewDuration() {
		return interviewDuration;
	}

	public void setInterviewDuration(String interviewDuration) {
		this.interviewDuration = interviewDuration;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getCandidatename() {
		return candidatename;
	}

	public void setCandidatename(String candidatename) {
		this.candidatename = candidatename;
	}

	/**
	 * @param candidatename
	 * @param emp_address
	 * @param emp_email
	 * @param jobTitle
	 * @param interviewType
	 * @param interviewerName
	 * @param stages
	 * @param interviewDate
	 * @param interviewTime
	 * @param interviewDuration
	 * @param notes
	 */
	public ScheduleInterview(String candidatename, String emp_address, String emp_email, String jobTitle,
			String interviewType, String interviewerName, String stages, String interviewDate, String interviewTime,
			String interviewDuration, String notes) {
		super();
		this.candidatename = candidatename;
		this.emp_address = emp_address;
		this.emp_email = emp_email;
		this.jobTitle = jobTitle;
		this.interviewType = interviewType;
		this.interviewerName = interviewerName;
		this.stages = stages;
		this.interviewDate = interviewDate;
		this.interviewTime = interviewTime;
		this.interviewDuration = interviewDuration;
		this.notes = notes;
	}

	/**
	 * 
	 */
	public ScheduleInterview() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
}