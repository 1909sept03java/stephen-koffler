package com.revature.beans;

import java.util.Date;

public class Reimb_Req {
	private int reimb_id;
	private int userId;
	private String description;
	private double dollar_amt;
	private Date openDate;
	private Date approvedDate;
	private int status;


	public Reimb_Req() {
		super();	
	}


	public Reimb_Req(int reimb_id, int userId, String description, double dollar_amt, Date openDate, Date approvedDate,
			int status) {
		super();
		this.reimb_id = reimb_id;
		this.userId = userId;
		this.description = description;
		this.dollar_amt = dollar_amt;
		this.openDate = openDate;
		this.approvedDate = approvedDate;
		this.status = status;
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


	public Date getOpenDate() {
		return openDate;
	}


	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}


	public Date getApprovedDate() {
		return approvedDate;
	}


	public void setApprovedDate(Date approvedDate) {
		this.approvedDate = approvedDate;
	}


	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}


}


	


	