package com.revature.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.query.Query;
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


	@Override
	public LibraryUser addUser(String username, String password, String firstname, String lastname, String email) {
		Session session = sf.openSession();
		
		LibraryUser user = new LibraryUser();
		user.setUsername(username);
		user.setPassword(password);
		user.setFirstname(firstname);
		user.setLastname(lastname);
		user.setEmail(email);
		
		
		Transaction tx = session.beginTransaction();
		session.save(user);
		tx.commit();
		session.close();
	
		return user;
	}

	@Override
	public boolean updateUser(LibraryUser user) {
		 	Session session = sf.openSession();
	        Transaction tx = session.beginTransaction();
	        String q = "Update LibraryUser Set username =: username, password =: password where id =: id";
	        Query query = session.createQuery(q);
	        query.setParameter("username", user.getUsername());
	        query.setParameter("password", user.getPassword());
	        query.setParameter("userid", user.getId());
	        query.executeUpdate();
	        session.update(user); // do we need this?
	        tx.commit();
	        return true;
		
	}

}
