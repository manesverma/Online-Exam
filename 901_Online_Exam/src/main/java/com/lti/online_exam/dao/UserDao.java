package com.lti.online_exam.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lti.online_exam.exception.ExamException;
import com.lti.online_exam.model.Login;
import com.lti.online_exam.model.User;

@Repository
public class UserDao implements IUserDao {

	@PersistenceContext
	private EntityManager enitityManager;
	
	@Override
	public User addUser(User user) throws ExamException {
		// TODO Auto-generated method stub
		enitityManager.persist(user);
		return user;
	}

	@Override
	public boolean authenticateUser(Login login) throws ExamException {
		if(login.getLoginUsername().equals("admin")&&login.getLoginPassword().equals("admin")) {
			return true;
		}
		return false;
	}

}
