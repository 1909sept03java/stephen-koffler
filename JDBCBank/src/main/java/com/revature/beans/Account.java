package com.revature.beans;

public class Account {
	int acct_id;
	double acct_bal;
	int acct_owner_id;
	
	public Account() {
		super();
	}

	public Account(int acct_id, double acct_bal, int acct_owner_id) {
		super();
		this.acct_id = acct_id;
		this.acct_bal = acct_bal;
		this.acct_owner_id = acct_owner_id;
	}

	public int getAcct_id() {
		return acct_id;
	}

	public void setAcct_id(int acct_id) {
		this.acct_id = acct_id;
	}

	public double getAcct_bal() {
		return acct_bal;
	}

	public void setAcct_bal(double acct_bal) {
		this.acct_bal = acct_bal;
	}

	public int getAcct_owner_id() {
		return acct_owner_id;
	}

	public void setAcct_owner_id(int acct_owner_id) {
		this.acct_owner_id = acct_owner_id;
	}
	
	

}