package com.lti.online_exam.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lti.online_exam.exception.ExamException;
import com.lti.online_exam.model.Question;

@Repository
public class QuestionDao implements IQuestionDao {

	@PersistenceContext
	private EntityManager enitityManager;
	
	@Override
	public Question addQuestion(Question question) throws ExamException {
		// TODO Auto-generated method stub
		System.out.println(question);
		enitityManager.persist(question);
		return question;
	}

}
