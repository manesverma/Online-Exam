package com.lti.online_exam.dao;

import com.lti.online_exam.exception.ExamException;
import com.lti.online_exam.model.Question;

public interface IQuestionDao {
	public Question addQuestion(Question question)throws ExamException;
}
