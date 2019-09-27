package com.revature.beans;

public class Reimb_Req {
	private int reimb_id;
	private int userId;
	private String description;
	private double dollar_amt;
	private boolean resolved;


	public Reimb_Req() {
		super();
	}


	public Reimb_Req(int reimb_id, int userId, String description, double dollar_amt, boolean resolved) {
		super();
		this.reimb_id = reimb_id;
		this.userId = userId;
		this.description = description;
		this.dollar_amt = dollar_amt;
		this.resolved = resolved;
	}


	public int getReimb_id() {
		return reimb_id;
	}


	public void setReimb_id(int reimb_id) {
		this.reimb_id = reimb_id;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public double getDollar_amt() {
		return dollar_amt;
	}


	public void setDollar_amt(double dollar_amt) {
		this.dollar_amt = dollar_amt;
	}


	public boolean isResolved() {
		return resolved;
	}


	public void setResolved(boolean resolved) {
		this.resolved = resolved;
	}
	
	
}