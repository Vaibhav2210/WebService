package com.vaibhav.wsapp.io.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name = "users")
public class UserEntity implements Serializable {

	private static final long serialVersionUID = 2708815426267501379L;

	@Id
	@GeneratedValue
	private long id;

	@Column(nullable = false)
	private String userId;

	@Column(nullable = false, length = 50)
	//private String firstName;
	private String fname;
	@Column(nullable = false, length = 50)
	//private String lastName;
	private String lname;

	//@Column(name = "email",unique=true, nullable = false, length = 150, columnDefinition = "varchar(255) default 'test@test.com'")
	@Column(nullable=false, unique=true,length=120)
	private String email;

	@Column(nullable = false)
	private String ecryptedPassword;

	@Column(nullable =false)
	private Boolean emailVerificationStatus = false;

	private String emailCerificationToken;
	
	private String password;

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

}
