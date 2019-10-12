package com.revature;

import com.revature.beans.LibraryUser;
import com.revature.dao.LibraryUserDAOImpl;
import com.revature.dao.LibraryUserDAOImpl;


public class Driver {

	
		public static void main(String[] args) {
			
			LibraryUserDAOImpl u = new LibraryUserDAOImpl();
			//System.out.println(u.login("admin", "admin").getFirstname());
			
			System.out.println(u.addUser("superman", "steel", "clark", "kent", "super@gotham.com").toString());
			
			

		}

	}


