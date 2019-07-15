package com.lti.online_exam.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Hb_Result")
public class Result {


	public Integer getResultId() {
		return resultId();
	}

	private Integer resultId() {
		return null;
	}

	public void setResultId(Integer resultId) {
		this.resultId = resultId;
	}

	@Id
	@Column(name="result_Id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer resultId;

	
	private String examTitle;
	private Integer totalMarks;
	private String obtainedMarks;
	public Result() {
	}
	public Result(String examTitle, Integer totalMarks, String obtainedMarks) {
		super();
		this.examTitle = examTitle;
		this.totalMarks = totalMarks;
		this.obtainedMarks = obtainedMarks;
	}
	public String getExamTitle() {
		return examTitle;
	}
	public void setExamTitle(String examTitle) {
		this.examTitle = examTitle;
	}
	public Integer getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(Integer totalMarks) {
		this.totalMarks = totalMarks;
	}
	public String getObtainedMarks() {
		return obtainedMarks;
	}
	public void setObtainedMarks(String obtainedMarks) {
		this.obtainedMarks = obtainedMarks;
	}
	@Override
	public String toString() {
		return "Result [examTitle=" + examTitle + ", totalMarks=" + totalMarks + ", obtainedMarks=" + obtainedMarks
				+ "]";
	}


}
