package com.natum.registration.model;

public class Passwords {
	private String custPassword;
	private String custConfirmPassword;
	
	public String getCustPassword() {
		return custPassword;
	}
	public void setCustPassword(String custPassword) {
		this.custPassword = custPassword;
	}
	public String getCustConfirmPassword() {
		return custConfirmPassword;
	}
	public void setCustConfirmPassword(String custConfirmPassword) {
		this.custConfirmPassword = custConfirmPassword;
	}
	@Override
	public String toString() {
		return "Passwords [custPassword=" + custPassword + ", custConfirmPassword=" + custConfirmPassword + "]";
	}

}
