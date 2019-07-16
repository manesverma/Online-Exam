package com.lti.online_exam.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="Test_Tb")
public class Test {
	@Id
	private Integer Id;
	
	@Column(name="Test_Name")
	private String name;
	
	@Column(name="Test_Email")
	private String email;

	public Test() {
		// TODO Auto-generated constructor stub
	}
	
	public Test(Integer id, String name, String email) {
		super();
		Id = id;
		this.name = name;
		this.email = email;
	}



	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Test [Id=" + Id + ", name=" + name + ", email=" + email + "]";
	}
	
	
}
