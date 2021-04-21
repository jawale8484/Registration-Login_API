package com.vaibhav.registration_login.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Registration_Login")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String username;
	private String password;
	private String mobilenum;
	private String address;
	
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}



	public User(int id, String username, String password, String mobilenum, String address) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.mobilenum = mobilenum;
		this.address = address;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getMobilenum() {
		return mobilenum;
	}



	public void setMobilenum(String mobilenum) {
		this.mobilenum = mobilenum;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", mobilenum=" + mobilenum
				+ ", address=" + address + "]";
	}
	
	
	
	
}
