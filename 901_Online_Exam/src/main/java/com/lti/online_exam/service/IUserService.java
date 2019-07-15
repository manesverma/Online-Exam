package com.lti.online_exam.service;

import com.lti.online_exam.exception.ExamException;
import com.lti.online_exam.model.Login;
import com.lti.online_exam.model.User;

public interface IUserService {
	public User addUser(User user)throws ExamException;
	public boolean authenticateUser(Login login)throws ExamException;
}
