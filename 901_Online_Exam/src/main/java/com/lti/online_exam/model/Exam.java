package com.lti.online_exam.model;

import javax.persistence.Column; 
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Exam_Tb")
public class Exam {
	@Id
	@Column(name="exam_ID")
	private Integer examId;
	
	@Column(name="exam_Name")
	private String examName;
	
	@Column(name="exam_Level")
	private Integer examLevel ;
	
	@Column(name="exam_Duration")
	private Integer examDuration ;

	public Exam() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Exam(String examName, Integer examLevel, Integer examDuration) {
		super();
		this.examName = examName;
		this.examLevel = examLevel;
		this.examDuration = examDuration;
	}



	public String getExamName() {
		return examName;
	}

	public void setExamName(String examName) {
		this.examName = examName;
	}

	public Integer getExamLevel() {
		return examLevel;
	}

	public void setExamLevel(Integer examLevel) {
		this.examLevel = examLevel;
	}

	public Integer getExamDuration() {
		return examDuration;
	}

	public void setExamDuration(Integer examDuration) {
		this.examDuration = examDuration;
	}

	@Override
	public String toString() {
		return "Exam [examId=" + examId + ", examName=" + examName + ", examLevel=" + examLevel + ", examDuration="
				+ examDuration + "]";
	}
}
