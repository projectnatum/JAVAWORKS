package com.natum.registration.model;

import java.sql.Date;

public class Customer {
	
	private int custId;
	private String custFirstName;
	private String custLastName;
	private String custSSN;
	private String custEmail;
	private Date custDOB;
	private int custZip;
	private Passwords passwords;
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustFirstName() {
		return custFirstName;
	}
	public void setCustFirstName(String custFirstName) {
		this.custFirstName = custFirstName;
	}
	public String getCustLastName() {
		return custLastName;
	}
	public void setCustLastName(String custLastName) {
		this.custLastName = custLastName;
	}

	public String getCustEmail() {
		return custEmail;
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	public Date getCustDOB() {
		return custDOB;
	}
	public void setCustDOB(Date custDOB) {
		this.custDOB = custDOB;
	}
	public int getCustZip() {
		return custZip;
	}
	public void setCustZip(int custZip) {
		this.custZip = custZip;
	}
	public Passwords getPasswords() {
		return passwords;
	}
	public void setPasswords(Passwords passwords) {
		this.passwords = passwords;
	}
	public String getCustSSN() {
		return custSSN;
	}
	public void setCustSSN(String custSSN) {
		this.custSSN = custSSN;
	}
	
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custFirstName=" + custFirstName + ", custLastName=" + custLastName
				+ ", custSSN=" + custSSN + ", custEmail=" + custEmail + ", custDOB=" + custDOB + ", custZip=" + custZip
				+ ", passwords=" + passwords + "]";
	}


	
	
	
	
	
	
	

}
