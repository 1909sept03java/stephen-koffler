package com.revature.beans;

import java.util.Date;

public class Reimb_Req {
	private int reimb_id;
	private int userId;
	private String description;
	private int dollar_amt;
	private String openDate;
	private String approvedDate;
	private int status;


	public Reimb_Req() {
		super();	
	}


	public Reimb_Req(int reimb_id, int userId, String description, int dollar_amt, String openDate, String approvedDate,
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


	public int getDollar_amt() {
		return dollar_amt;
	}


	public void setDollar_amt(int dollar_amt) {
		this.dollar_amt = dollar_amt;
	}


	public String getOpenDate() {
		return openDate;
	}


	public void setOpenDate(String openDate) {
		this.openDate = openDate;
	}


	public String getApprovedDate() {
		return approvedDate;
	}


	public void setApprovedDate(String approvedDate) {
		this.approvedDate = approvedDate;
	}


	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}


}