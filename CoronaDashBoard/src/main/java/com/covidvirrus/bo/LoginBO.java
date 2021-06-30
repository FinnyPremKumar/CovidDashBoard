package com.covidvirrus.bo;

public class LoginBO {
	private String email;
	private int password;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		System.out.println("This Line is CAlling..............");
		this.email = email;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(String password) {
		System.out.println("password Line is CAlling.............."+password);
		this.password = password.hashCode();
	}
	
}
