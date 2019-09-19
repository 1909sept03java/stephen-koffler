package com.revature.beans;

public class Acct_Owner {
	private int acct_Owner_id;
	private String acct_Owner_Fname;
	private String acct_Owner_Lname;
	private int registered;
	private String password;
	private String user_name;
	
	public Acct_Owner() {
		super();
	}

	public Acct_Owner(int acct_Owner_id, String acct_Owner_Fname, String acct_Owner_Lname,  int registered,
			String password, String user_name) {
		super();
		this.acct_Owner_id = acct_Owner_id;
		this.acct_Owner_Fname = acct_Owner_Fname;
		this.acct_Owner_Lname = acct_Owner_Lname;
		this.registered = registered;
		this.password = password;
		this.user_name = user_name;
	}

	public int getAcct_Owner_id() {
		return acct_Owner_id;
	}

	public void setAcct_Owner_id(int acct_Owner_id) {
		this.acct_Owner_id = acct_Owner_id;
	}

	public String getAcct_Owner_Fname() {
		return acct_Owner_Fname;
	}

	public void setAcct_Owner_Fname(String acct_Owner_Fname) {
		this.acct_Owner_Fname = acct_Owner_Fname;
	}

	public String getAcct_Owner_Lname() {
		return acct_Owner_Lname;
	}

	public void setAcct_Owner_Lname(String acct_Owner_Lname) {
		this.acct_Owner_Lname = acct_Owner_Lname;
	}

	

	public int getRegistered() {
		return registered;
	}

	public void setRegistered(int registered) {
		this.registered = registered;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	@Override
	public String toString() {
		return "Acct_Owner [acct_Owner_id=" + acct_Owner_id + ", acct_Owner_Fname=" + acct_Owner_Fname
				+ ", acct_Owner_Lname=" + acct_Owner_Lname + ",   registered=" + registered
				+ ", password=" + password + ", user_name=" + user_name + "]";
	}

	
	
	

}