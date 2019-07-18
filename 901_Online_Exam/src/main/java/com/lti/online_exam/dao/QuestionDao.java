package com.lti.online_exam.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lti.online_exam.exception.ExamException;
import com.lti.online_exam.model.Question;

@Repository
public class QuestionDao implements IQuestionDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Question addQuestion(Question question) throws ExamException {
		// TODO Auto-generated method stub
		System.out.println(question);
		entityManager.persist(question);
		return question;
	}

	@Override
	public Question getQuestionById(Integer questionId) throws ExamException {		
		return (Question) entityManager.find(Question.class,questionId);
	}
	@Override
	public Question removeQuestion(Integer questionId) throws ExamException {
		// TODO Auto-generated method stub
		Question question=getQuestionById(questionId);
		if (question!=null) entityManager.remove(question);
		return question;
	}
	public List<Question> getQuestionList() throws ExamException {	
		List<Question> quesList = entityManager.createQuery("from Question").getResultList();
		quesList.forEach((data)->System.out.println("\n\n"+data+"\n\n")); 
		return quesList;
	}
}