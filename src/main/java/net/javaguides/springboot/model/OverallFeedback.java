package net.javaguides.springboot.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "overallFeedback")

public class OverallFeedback {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "Candidatename")
	private String candidateName;

	@Column(name = "JobTitle")
	private String jobtitle;
	@Column(name = "TechinicalRoundResult")
	private String techinicalroundresult;
	@Column(name = "HRRoundResult")
	private String hrroundresult;
	@Column(name = "Comments")
	private String comments;
	@Column(name = "Rating")
	private int rating;
	@Column(name = "Result")
	private String overallresult;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCandidateName() {
		return candidateName;
	}

	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}

	public String getJobtitle() {
		return jobtitle;
	}

	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}

	public String getTechinicalroundresult() {
		return techinicalroundresult;
	}

	public void setTechinicalroundresult(String techinicalroundresult) {
		this.techinicalroundresult = techinicalroundresult;
	}

	public String getHrroundresult() {
		return hrroundresult;
	}

	public void setHrroundresult(String hrroundresult) {
		this.hrroundresult = hrroundresult;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getOverallresult() {
		return overallresult;
	}

	public void setOverallresult(String overallresult) {
		this.overallresult = overallresult;
	}

	@Override
	public String toString() {
		return "OverallFeedback [id=" + id + ", candidateName=" + candidateName + ", jobtitle=" + jobtitle
				+ ", techinicalroundresult=" + techinicalroundresult + ", hrroundresult=" + hrroundresult
				+ ", comments=" + comments + ", rating=" + rating + ", overallresult=" + overallresult + "]";
	}

	public OverallFeedback() {

	}
}
