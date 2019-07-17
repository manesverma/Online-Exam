package com.lti.online_exam.dao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Tuple;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

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
		/*if(login.getloginUserEmail().equals("admin")&&login.getLoginPassword().equals("admin")) {
			return true;
		}
		return false;*/
		System.out.println("\n\n\n"+login+"\n\n\n");
		
		CriteriaBuilder criteriaBuilder = enitityManager.getCriteriaBuilder();
		//CriteriaQuery criteria = criteriaBuilder.createQuery(Login.class);
		CriteriaQuery<Tuple> criteria = criteriaBuilder.createTupleQuery();
		Root<Login> loginRoot = criteria.from(Login.class);
		criteria.multiselect(loginRoot.get("loginUserEmail"),loginRoot.get("loginPassword"),loginRoot.get("loginRole"));
		criteria.where(criteriaBuilder.equal(loginRoot.get("loginRole"),login.getLoginRole()));
		
		Tuple result;
		try {
			result = enitityManager.createQuery(criteria).getSingleResult();
			return true;
		} catch (NoResultException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
		
	}

}
