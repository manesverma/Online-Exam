package com.lti.spring.dao;

import java.util.List;

import com.lti.spring.exception.ExamException;
import com.lti.spring.model.Exam;

	public interface IExamDao {
		public List<Exam> getExamList()throws ExamException;
}
