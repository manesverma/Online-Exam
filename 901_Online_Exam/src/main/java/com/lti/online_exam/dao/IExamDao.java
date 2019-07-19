package com.lti.online_exam.dao;

import java.util.List;

import com.lti.online_exam.exception.ExamException;
import com.lti.online_exam.model.Exam;

	public interface IExamDao {
		public List<Exam> getExamList()throws ExamException;
		public List<Exam> getSubjectExamList() throws ExamException; 
} 