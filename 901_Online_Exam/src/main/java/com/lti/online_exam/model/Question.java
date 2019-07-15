package com.lti.online_exam.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name="Hb_Question")
public class Question {


public Integer getQuestionId() {
		return questionId();
	}

	private Integer questionId() {
	return null;
}

	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}

	@Id
	@Column(name="question_Id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer questionId;

	
	private String subject;
	private Integer level;
	@Column(name="correct_Ans")
	private String correctAns;

	public Question() {
		super();
	}

	public Question(String subject, Integer level, String correctAns) {
		super();
		this.setSubject(subject);
		this.setLevel(level);
		this.setCorrectAns(correctAns);
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public String getCorrectAns() {
		return correctAns;
	}

	public void setCorrectAns(String correctAns) {
		this.correctAns = correctAns;
	}

	@Override
	public String toString() {
		return "Question [subject=" + subject + ", level=" + level + ", correctAns=" + correctAns + "]";
	}



	}

