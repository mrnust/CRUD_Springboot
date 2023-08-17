package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity

	// user table

	
public class User {
	@Id
	private String email;
	private String password;
	
	  public String  getEmail() {
	    return email;
	  }

	  public void setEmail(String s) {
	    this.email = s;
	  }

	  public String getPassword() {
	    return password;
	  }

	  public void setPassword(String pass) {
	    this.password = pass;
	  }
	  
}
