package com.lti.spring.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lti.spring.exception.ExamException;
import com.lti.spring.model.Exam;

@Repository 
public class ExamDao implements IExamDao{

	@PersistenceContext
	private EntityManager enitityManager;
	@SuppressWarnings("unchecked")
	@Override
	public List<Exam> getExamList() throws ExamException {		
		return enitityManager.createQuery("from Exam").getResultList();
	}

}
	
