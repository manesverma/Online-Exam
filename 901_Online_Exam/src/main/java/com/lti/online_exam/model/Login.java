
package com.lti.online_exam.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Login_Tb")
public class Login implements Serializable{
	private static final long serialVersionUID = -2101932522435944299L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Login_Id")
	private Integer loginId;
	
	@Column(name="Login_Username")
	@NotNull(message="username is required")
	private String loginUserEmail;
	
	@Column(name="Login_Password")
	@NotNull(message="password is required")
	private String loginPassword;
	
	@Column(name="Login_Role")
	@NotNull(message="Role is Required")
	private String loginRole;
	
	public Login() {
	}

	public Login(String loginUserEmail, String loginPassword, String loginRole) {
		super();
		this.loginUserEmail = loginUserEmail;
		this.loginPassword = loginPassword;
		this.loginRole = loginRole;
	}

	public String getloginUserEmail() {
		return loginUserEmail;
	}

	public void setloginUserEmail(String loginUserEmail) {
		this.loginUserEmail = loginUserEmail;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public String getLoginRole() {
		return loginRole;
	}

	public void setLoginRole(String loginRole) {
		this.loginRole = loginRole;
	}

	@Override
	public String toString() {
		return "Login [loginId=" + loginId + ", loginUserEmail=" + loginUserEmail + ", loginPassword=" + loginPassword
				+ ", loginRole=" + loginRole + "]";
	}
	
}