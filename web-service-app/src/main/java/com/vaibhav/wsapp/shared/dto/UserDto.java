package com.vaibhav.wsapp.shared.dto;

import java.io.Serializable;

public class UserDto implements Serializable{
	
	private static final long serialVersionUID = 5675692245316943361L;
	private long id;
	private String userId;
	//private String firstName;
	//private String lastName;
	private String fname;
	private String lname;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	private String email;
	private String password;
	private String  ecryptedPassword;
	private Boolean emailVerificationStatus = false; 
	private String emailCerificationToken;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
	/*public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}*/
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEcryptedPassword() {
		return ecryptedPassword;
	}
	public void setEcryptedPassword(String ecryptedPassword) {
		this.ecryptedPassword = ecryptedPassword;
	}
	public Boolean getEmailVerificationStatus() {
		return emailVerificationStatus;
	}
	public void setEmailVerificationStatus(Boolean emailVerificationStatus) {
		this.emailVerificationStatus = emailVerificationStatus;
	}
	public String getEmailCerificationToken() {
		return emailCerificationToken;
	}
	public void setEmailCerificationToken(String emailCerificationToken) {
		this.emailCerificationToken = emailCerificationToken;
	}
	
	



}
