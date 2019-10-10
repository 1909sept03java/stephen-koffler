package com.revature.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import com.revature.beans.LibraryUser;
import com.revature.util.ConnectionUtil;

public class LibraryUserDAOImpl implements LibraryUserDAO {
	

	
	
	private SessionFactory sf = ConnectionUtil.getSessionFactory();
	
	
	@Override
	public LibraryUser login(String username, String password) {
		
		LibraryUser u = null;
		Query query = sf.openSession().createQuery("From LibraryUser where username= :username AND password =:password");
		query.setParameter("username", username);
		query.setParameter("password", password);
			
		List list = query.list();
		//list.get(0);
		if (list.get(0) != null) {
			System.out.println(list);
		u =(LibraryUser) (list.get(0));
		}
		return u;
	}

//	public User getById(int id) {
//		User u = null;
//		try (Session s = sf.openSession()) {
//			u = s.get(User.class, id);
//		}
//		if(u != null)
//			return u;
//		else
//		return null;
//		
//	}

		@Override
	public LibraryUser getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addUser(LibraryUser user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateUser(LibraryUser user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUser(LibraryUser user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<LibraryUser> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	

	
	

}
