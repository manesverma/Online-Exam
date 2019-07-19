package com.lti.online_exam.service;
 
import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.online_exam.dao.IExamDao;
import com.lti.online_exam.model.Exam;
import com.lti.online_exam.exception.ExamException;
@Service
public class ExamService implements IExamService{
	@Autowired
	private IExamDao examDao;

	@Override
	@Transactional
	public List<Exam> getExamList() throws ExamException {
		return null; 
	}
	
	@Override
	@Transactional
	public List<Exam> getSubjectExamList() throws ExamException {
		return null;
	}

}