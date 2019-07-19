package com.lti.online_exam.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.online_exam.exception.ExamException;
import com.lti.online_exam.model.Exam;

@Repository 
public class ExamDao implements IExamDao{

	@Autowired
	private HttpSession httpSession;
	@PersistenceContext
	private EntityManager enitityManager;
	@SuppressWarnings("unchecked")
	@Override
	public List<Exam> getExamList() throws ExamException {		
		return enitityManager.createQuery("from Exam").getResultList();
	}
	@Override
	public List<Exam> getSubjectExamList() throws ExamException {
		String subjectName = (String) httpSession.getAttribute("subjectName");
		System.out.println("\n\n\n"+subjectName+"\n\n\n");
		return enitityManager.createQuery("from Exam").getResultList();
	}
	
}