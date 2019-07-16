package com.lti.spring.service;

import java.util.List;

import org.omg.CORBA.UserException;

import com.lti.spring.exception.ExamException;
import com.lti.spring.model.Exam;

public interface IExamService {

	public List<Exam> getExamList()throws ExamException;
	//public User addUser(User user)throws ExamException;
}
