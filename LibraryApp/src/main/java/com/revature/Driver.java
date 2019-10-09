package com.revature;

import com.revature.beans.User;
import com.revature.dao.UserDAO;
import com.revature.dao.UserDAOImpl;


public class Driver {

	
		public static void main(String[] args) {
			
			UserDAOImpl u = new UserDAOImpl();
			
			u.addUser(new User("Z Chen", "leader"));
			u.addUser(new User("S Koffler", "hiber"));
			u.addUser(new User("C Zhang", "physics"));
			u.addUser(new User("M Ahmar", "glue"));
			u.addUser(new User("B Thomas", "Fe"));
			//for (User user: u.getAll()) {
			//System.out.println(user);

		}

	}


