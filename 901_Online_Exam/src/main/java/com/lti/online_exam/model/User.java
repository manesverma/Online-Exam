package com.lti.online_exam.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
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
	
	@Column(name="User_State")
    private String userState;
	
	@Column(name="User_City")
    private String userCity;
	
	@Column(name="User_Password")
	private String userPassword;
    
	
	@OneToOne(mappedBy="user", cascade=CascadeType.ALL)
	private Address userAddress;
	
	public User() {	
	}
	
	

	public User(String userName, String userEmail, Date userDob, String userMobile, String userState, String userCity,
			String userPassword, Address userAddress) {
		super();
		this.userName = userName;
		this.userEmail = userEmail;
		this.userDob = userDob;
		this.userMobile = userMobile;
		this.userState = userState;
		this.userCity = userCity;
		this.userPassword = userPassword;
		this.userAddress = userAddress;
	}



	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getuserName() {
		return userName;
	}

	public void setuserName(String userName) {
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
	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}
	public void setUserState(String userState) {
		this.userState = userState;
	}

	public Address getUserAddress() {
		return userAddress;
	}
	public String getUserState() {
		return userState;
	}
	public String getUserCity() {
		return userCity;
	}
	public void setUserAddress(Address userAddress) {
		this.userAddress = userAddress;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + ", userDob=" + userDob
				+ ", userMobile=" + userMobile + ", userState=" + userState + ", userCity=" + userCity
				+ ", userAddress=" + userAddress + "]";
	}
	
	
}
