package com.java.model;

public class User {
	private int id;
	private String Uname;
	private String email;
	private String fname;
	private String lname;
	private String phone;
	private String pwd;
	
	public User() {
		
	}

	public User(int id, String uname, String email, String fname, String lname, String phone, String pwd) {
		//super();
		this.id = id;
		this.Uname = uname;
		this.email = email;
		this.fname = fname;
		this.lname = lname;
		this.phone = phone;
		this.pwd = pwd;
	}

	public int getId() {
		return id;
	}

	public String getUname() {
		return Uname;
	}

	public String getEmail() {
		return email;
	}

	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	public String getPhone() {
		return phone;
	}

	public String getPwd() {
		return pwd;
	}
	public void setId(int id) {
		this.id = id;
	}

	public void setUname(String uname) {
		Uname = uname;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}
