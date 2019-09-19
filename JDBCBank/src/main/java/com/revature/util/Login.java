package com.revature.util;
import java.util.*;
import java.util.List;

import com.revature.dao.AccountDAOImpl;
import com.revature.dao.Acct_OwnerDAOImpl;
import com.revature.beans.Account;
import com.revature.beans.Acct_Owner;

public class Login {
	
	

	static Scanner scanner = new Scanner(System.in);
	static Acct_Owner acct_owner;

	
	public static void main(String[] args) {
		int acct_owner_id;
		List<Account> acct_list;
		acct_owner = RegisteredLogin(); //returns an account owner object
		acct_owner_id = acct_owner.getAcct_Owner_id();
		System.out.println(acct_owner_id);
		AccountDAOImpl adi = new AccountDAOImpl();
		acct_list = adi.getAccounts(acct_owner_id);
		for (Account ac : acct_list)
			System.out.println(ac.getAcct_bal());
		
		Acct_OwnerDAOImpl oi = new Acct_OwnerDAOImpl();
		oi.createAccount(acct_owner_id);
		oi.deleteAccount(acct_owner_id);
		oi.deposit(acct_owner_id);
	}

	//Method for registered users to input their login creds.
	public static Acct_Owner RegisteredLogin() {
		Acct_Owner owner;
		String username;
		String password;
		System.out.println("Please enter your user name: ");
		username = scanner.nextLine();
		System.out.println("Please enter your password: ");
		password = scanner.nextLine();
		Acct_OwnerDAOImpl ac = new Acct_OwnerDAOImpl();
		
			owner = ac.login(username, password);
			System.out.println(owner.toString());
		
		return owner;
	}
	
}
class InvalidInputException extends Exception{
	InvalidInputException(String message) {
		super(message);
		
		}
	}