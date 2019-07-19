package com.lti.online_exam.service;

import java.util.List;

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
	@Transactional
	public Question getQuestionById(Integer questionId) throws ExamException {
		// TODO Auto-generated method stub
		return questionDao.getQuestionById(questionId);
	}
	@Override
	@Transactional
	public Question removeQuestion(Integer questionId) throws ExamException {
		return questionDao.removeQuestion(questionId);
	}
	@Override
	@Transactional
	public List<Question> getQuestionList() throws ExamException {
		// TODO Auto-generated method stub
		return questionDao.getQuestionList();
	}
	
	@Override
	@Transactional
	public List<Question> getSubjectQuestionList() throws ExamException {
		// TODO Auto-generated method stub
		return questionDao.getSubjectQuestionList();
	}
}
