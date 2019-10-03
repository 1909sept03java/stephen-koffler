package com.revature.beans;

public class Employee {
	private int userId;
	private String fname;
	private String lname;
	private String addr_1;
	private String addr_2;
	private String password;
	private int mgr_id;
	private int is_mgr;


	public Employee() {
		super();
	}


	public Employee(int userId, String fname, String lname, String addr_1, String addr_2, String password, int mgr_id,
			int is_mgr) {
		super();
		this.userId = userId;
		this.fname = fname;
		this.lname = lname;
		this.addr_1 = addr_1;
		this.addr_2 = addr_2;
		this.password = password;
		this.mgr_id = mgr_id;
		this.is_mgr = is_mgr;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
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


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public int getMgr_id() {
		return mgr_id;
	}


	public void setMgr_id(int mgr_id) {
		this.mgr_id = mgr_id;
	}


	public int getIs_mgr() {
		return is_mgr;
	}


	public void setIs_mgr(int is_mgr) {
		this.is_mgr = is_mgr;
	}


	
}