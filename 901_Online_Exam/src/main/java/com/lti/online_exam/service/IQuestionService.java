package com.lti.online_exam.service;

import com.lti.online_exam.exception.ExamException;
import com.lti.online_exam.model.Question;

public interface IQuestionService {
	public  Question addQuestion(Question question)throws ExamException;
	public  Question removeQuestion(Question question)throws ExamException;
}
