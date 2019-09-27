package com.revature.beans;

public class Employee {
	private int userId;
	private String fname;
	private String lname;
	private String addr_1;
	private String addr_2;


	public Employee() {
		super();
	}


	public Employee(int userId, String fname, String lname, String addr_1, String addr_2) {
		super();
		this.userId = userId;
		this.fname = fname;
		this.lname = lname;
		this.addr_1 = addr_1;
		this.addr_2 = addr_2;
	}


	public int getUserid() {
		return userId;
	}


	public void setUserid(int userid) {
		this.userId = userid;
	}


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


	public String getAddr_1() {
		return addr_1;
	}


	public void setAddr_1(String addr_1) {
		this.addr_1 = addr_1;
	}


	public String getAddr_2() {
		return addr_2;
	}


	public void setAddr_2(String addr_2) {
		this.addr_2 = addr_2;
	}
	
	
}