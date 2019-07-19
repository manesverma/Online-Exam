package com.lti.online_exam.service;
 
import java.util.List;

import com.lti.online_exam.exception.ExamException;
import com.lti.online_exam.model.Exam;

public interface IExamService {

	public List<Exam> getExamList()throws ExamException;
	public List<Exam> getSubjectExamList() throws ExamException; 
	//public User addUser(User user)throws ExamException;
}
