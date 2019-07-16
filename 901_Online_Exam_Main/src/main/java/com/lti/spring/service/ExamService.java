package com.lti.spring.service;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.spring.dao.IExamDao;
import com.lti.spring.model.Exam;
import com.lti.spring.exception.ExamException;

@Service
public class ExamService implements IExamService{
	//prep work 2 autowire Dao object
	@Autowired
	private IExamDao examDao;

	@Override
	@Transactional
	public List<Exam> getExamList() throws ExamException {
		// TODO Auto-generated method stub
		return null; 
	}

	/*@Override
	public User addUser(User user) throws ExamException {
		// TODO Auto-generated method stub
		return null;
	}*/
}
