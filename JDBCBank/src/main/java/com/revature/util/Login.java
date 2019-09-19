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
		boolean inSession = true;
		List<Account> acct_list;
		while(acct_owner == null) {// keep running unitl acct_owner is assigned
		acct_owner = RegisteredLogin(); //returns an account owner object
		}
		acct_owner_id = acct_owner.getAcct_Owner_id();
		AccountDAOImpl adi = new AccountDAOImpl();
	
		Acct_OwnerDAOImpl oi = new Acct_OwnerDAOImpl();
		
		int selection;
		
		while(inSession == true) {
			System.out.println("Please select and option:");
			System.out.println("1. View your accounts and balances");
			System.out.println("2. Create an account");
			System.out.println("3. Delete an account");
			System.out.println("4. Make a deposit");
			System.out.println("5. Make a withdrawl ");
			System.out.println("6. Exit the System");
			
			selection = scanner.nextInt();
			if(selection == 1) {
				acct_list = adi.getAccounts(acct_owner_id);
				for (Account ac : acct_list) {
					System.out.println(ac.getAcct_id() +"  $"+ ac.getAcct_bal());
				
				}
			}
			else if(selection == 2)
				oi.createAccount(acct_owner_id);
			else if(selection == 3)
				oi.deleteAccount(acct_owner_id);
			else if(selection == 4)
				oi.deposit(acct_owner_id);
			else if (selection == 5)
				oi.withdraw(acct_owner_id);
			else if (selection == 6) {
				inSession = false;
				System.out.println("Thanks for banking with us!");
			
			}
		
		}
	
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
			//System.out.println(owner.toString());
		
		return owner;
		
	}
	
}
class InvalidInputException extends Exception{
	InvalidInputException(String message) {
		super(message);
		
		}
	}