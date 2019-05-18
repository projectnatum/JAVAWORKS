package com.natum.registration.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity(name = "customers")
@Table(name = "customers")
public class CustomerDAO {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int custId;
  private String custFirstName;
  private String custLastName;
  private String custSSN;
  private String custEmail;
  private Date custDOB;
  private int custZip;
  private String custPassword;

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

  //		public String getUserName() {
//			return userName;
//		}
//		public void setUserName(String userName) {
//			this.userName = userName;
//		}
//		public String getEmail() {
//			return email;
//		}
//		public void setEmail(String email) {
//			this.email = email;
//		}
  public void setCustDOB(Date custDOB) {
    this.custDOB = custDOB;
  }

  public int getCustZip() {
    return custZip;
  }

  public void setCustZip(int custZip) {
    this.custZip = custZip;
  }

  @Override
  public String toString() {
    return "Customer [custId=" + custId + ", custFirstName=" + custFirstName + ", custLastName=" + custLastName
      + ", custSSN=" + custSSN + ", custEmail=" + custEmail + ", custDOB=" + custDOB + ", custZip="
      + custZip + ", custPassword=" + custPassword + "]";
  }

  public String getCustPassword() {
    return custPassword;
  }

  public void setCustPassword(String custPassword) {
    this.custPassword = custPassword;
  }

  public String getCustSSN() {
    return custSSN;
  }

  public void setCustSSN(String custSSN) {
    this.custSSN = custSSN;
  }
}


