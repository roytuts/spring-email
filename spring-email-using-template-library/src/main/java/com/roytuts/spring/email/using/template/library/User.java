package com.roytuts.spring.email.using.template.library;

public class User {

	private String userName;
	private String emailAddress;

	public User(String userName, String emailAddress) {
		this.userName = userName;
		this.emailAddress = emailAddress;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
}