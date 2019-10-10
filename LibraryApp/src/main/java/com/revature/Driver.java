package com.revature;

import com.revature.beans.LibraryUser;
import com.revature.dao.LibraryUserDAOImpl;
import com.revature.dao.LibraryUserDAOImpl;


public class Driver {

	
		public static void main(String[] args) {
			
			LibraryUserDAOImpl u = new LibraryUserDAOImpl();
			System.out.println(u.login("admin", "admin").getFirstname());
			
//			u.addUser(new User("Z Chen", "leader"));
//			u.addUser(new User("S Koffler", "hiber"));
//			u.addUser(new User("C Zhang", "physics"));
//			u.addUser(new User("M Ahmar", "glue"));
//			u.addUser(new User("B Thomas", "Fe"));
			//for (User user: u.getAll()) {
			//System.out.println(user);

		}

	}


