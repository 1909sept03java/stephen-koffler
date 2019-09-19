package com.revature.dao;


import com.revature.beans.Acct_Owner;
public interface Acct_OwnerDAO {
	
	public Acct_Owner login(String user_name, String password) ;
	public void createAccount(int acct_owner_id);
	public void deleteAccount(int acct_owner_id);
	public void deposit(int acct_owner_id);
	public void withdraw(int acct_owner_id);

}