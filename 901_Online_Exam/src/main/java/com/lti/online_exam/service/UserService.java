package com.lti.online_exam.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.online_exam.dao.IUserDao;
import com.lti.online_exam.exception.ExamException;
import com.lti.online_exam.model.Login;
import com.lti.online_exam.model.User;

@Service
public class UserService implements IUserService {
	@Autowired
	private IUserDao userDao;
	

	@Override
	@Transactional
	public User addUser(User user) throws ExamException {
		return userDao.addUser(user);
	}

	@Override
	@Transactional
	public boolean authenticateUser(Login login) throws ExamException {
		// TODO Auto-generated method stub
		return userDao.authenticateUser(login);
	}
}
