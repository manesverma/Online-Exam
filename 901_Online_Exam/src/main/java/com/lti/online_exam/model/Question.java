package com.lti.online_exam.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Question_Tb")
public class Question {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="question_ID")
	private Integer questionId;
	
	@Column(name="question_Desc")
	private String questionDesc;
	
	@Column(name="question_Subject")
	private String questionSubject;
	
	@Column(name="option_First")
	private String optionFirst;
	
	@Column(name="option_Second")
	private String optionSecond;
	
	@Column(name="option_Third")
	private String optionThird;
	
	@Column(name="option_Fourth")
	private String optionFourth;
	
	@Column(name="correct_Option")
	private String correctOption ;

	@Column(name="question_Level")
	private Integer questionLevel;
	
	
	
	public Question() {
		
	}
	
	
	
	
	public Question(String questionDesc, String questionSubject, String optionFirst, String optionSecond,
			String optionThird, String optionFourth, String correctOption, Integer questionLevel) {
		super();
		this.questionDesc = questionDesc;
		this.questionSubject = questionSubject;
		this.optionFirst = optionFirst;
		this.optionSecond = optionSecond;
		this.optionThird = optionThird;
		this.optionFourth = optionFourth;
		this.correctOption = correctOption;
		this.questionLevel = questionLevel;
	}


	public String getQuestionSubject() {
		return questionSubject;
	}
	public void setQuestionSubject(String questionSubject) {
		this.questionSubject = questionSubject;
	}
	public String getQuestionDesc() {
		return questionDesc;
	}


	public void setQuestionDesc(String questionDesc) {
		this.questionDesc = questionDesc;
	}


	public String getOptionFirst() {
		return optionFirst;
	}
	public void setOptionFirst(String optionFirst) {
		this.optionFirst = optionFirst;
	}
	public String getOptionSecond() {
		return optionSecond;
	}
	public void setOptionSecond(String optionSecond) {
		this.optionSecond = optionSecond;
	}
	public String getOptionThird() {
		return optionThird;
	}
	public void setOptionThird(String optionThird) {
		this.optionThird = optionThird;
	}
	public String getOptionFourth() {
		return optionFourth;
	}
	public void setOptionFourth(String optionFourth) {
		this.optionFourth = optionFourth;
	}
	public String getCorrectOption() {
		return correctOption;
	}
	public void setCorrectOption(String correctOption) {
		this.correctOption = correctOption;
	}
	public Integer getQuestionLevel() {
		return questionLevel;
	}
	public void setQuestionLevel(Integer questionLevel) {
		this.questionLevel = questionLevel;
	}
	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", questionDesc=" + questionDesc + ", questionSubject="
				+ questionSubject + ", optionFirst=" + optionFirst + ", optionSecond=" + optionSecond + ", optionThird="
				+ optionThird + ", optionFourth=" + optionFourth + ", correctOption=" + correctOption
				+ ", questionLevel=" + questionLevel + "]";
	}


}
