package com.lti.online_exam.service;

import java.util.List;

import com.lti.online_exam.exception.ExamException;
import com.lti.online_exam.model.Question;

public interface IQuestionService {
	public  Question addQuestion(Question question)throws ExamException;
	public Question removeQuestion(Integer questionId) throws ExamException;
	public Question getQuestionById(Integer questionId) throws ExamException;
	public List<Question> getQuestionList() throws ExamException;
}
