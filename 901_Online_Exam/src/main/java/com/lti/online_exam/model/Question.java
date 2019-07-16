package com.lti.online_exam.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Question_Tb")
public class Question {
	@Id
	@Column(name="question_ID")
	private Integer questionId;
	
	@Column(name="question_Subject")
	private String questionSubject;
	
	@Column(name="answer")
	private String answer ;

	public Question() {
		
	}
	public Question(String questionSubject, String answer) {
		super();
		this.questionSubject = questionSubject;
		this.answer = answer;
	}

	public String getQuestionSubject() {
		return questionSubject;
	}

	public void setQuestionSubject(String questionSubject) {
		this.questionSubject = questionSubject;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", questionSubject=" + questionSubject + ", answer=" + answer
				+ "]";
	}
}
