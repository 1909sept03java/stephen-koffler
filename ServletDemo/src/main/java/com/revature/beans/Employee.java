package com.revature.beans;

public class Employee {
	private int ee_id;
	private String fname;
	private String lname;
	private String addr_1;
	private String addr_2;


	public Employee() {
		super();
	}


	public Employee(int ee_id, String fname, String lname, String addr_1, String addr_2) {
		super();
		this.ee_id = ee_id;
		this.fname = fname;
		this.lname = lname;
		this.addr_1 = addr_1;
		this.addr_2 = addr_2;
	}


	public int getEe_id() {
		return ee_id;
	}


	public void setEe_id(int ee_id) {
		this.ee_id = ee_id;
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