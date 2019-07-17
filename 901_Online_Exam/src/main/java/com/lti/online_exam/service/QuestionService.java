package com.lti.online_exam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.online_exam.dao.IQuestionDao;
import com.lti.online_exam.exception.ExamException;
import com.lti.online_exam.model.Question;
@Service
public class QuestionService implements IQuestionService {

	@Autowired
	private IQuestionDao questionDao;
	@Override
	@Transactional
	public Question addQuestion(Question question) throws ExamException {
		return questionDao.addQuestion(question);
		
	}

	@Override
	public Question removeQuestion(Question question) throws ExamException {
		// TODO Auto-generated method stub
		return null;
	}

}
