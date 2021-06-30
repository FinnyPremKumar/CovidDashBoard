package com.covidvirrus.bo;

public class SignUpBO {
	private String username;
	private String emailId;
	private String mobileNo;
	private int password;
	private int confirmPassword;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password.hashCode();
	}
	public int getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword.hashCode();
	}
}
