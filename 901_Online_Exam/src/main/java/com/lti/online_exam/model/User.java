package com.lti.online_exam.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="User_Tb")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="User_Id")
	private Integer userId;
	
	@Column(name="User_Name")
	private String userName;
	
	@Column(name="User_Email")
	private String userEmail;
	
	@Column(name="User_Dob")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date userDob;
	
	@Column(name="User_Mobile")
	private String userMobile;
	
	@Column(name="User_Password")
	private String userPassword;
    
	@Column(name="User_Street")
	private String userStreet;

	@Column(name="User_City")
	private String userCity;

	@Column(name="User_State")
	private String userState;

	@Column(name="User_Country")
	private String userCountry;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String userName, String userEmail, Date userDob, String userMobile, String userPassword,
			String userStreet, String userCity, String userState, String userCountry) {
		super();
		this.userName = userName;
		this.userEmail = userEmail;
		this.userDob = userDob;
		this.userMobile = userMobile;
		this.userPassword = userPassword;
		this.userStreet = userStreet;
		this.userCity = userCity;
		this.userState = userState;
		this.userCountry = userCountry;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public Date getUserDob() {
		return userDob;
	}

	public void setUserDob(Date userDob) {
		this.userDob = userDob;
	}

	public String getUserMobile() {
		return userMobile;
	}

	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserStreet() {
		return userStreet;
	}

	public void setUserStreet(String userStreet) {
		this.userStreet = userStreet;
	}

	public String getUserCity() {
		return userCity;
	}

	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}

	public String getUserState() {
		return userState;
	}

	public void setUserState(String userState) {
		this.userState = userState;
	}

	public String getUserCountry() {
		return userCountry;
	}

	public void setUserCountry(String userCountry) {
		this.userCountry = userCountry;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + ", userDob=" + userDob
				+ ", userMobile=" + userMobile + ", userPassword=" + userPassword + ", userStreet=" + userStreet
				+ ", userCity=" + userCity + ", userState=" + userState + ", userCountry=" + userCountry + "]";
	}
}
