package com.libraryCatalogue.Model.DAO;
import com.libraryCatalogue.*;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.query.Query;

import com.libraryCatalogue.Model.Bean.Book;
import com.libraryCatalogue.Model.Bean.LibraryUser;
import com.libraryCatalogue.Util.ConnectionUtil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


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

/**
 * The method allows a new user to register in the system.
 * The method takes in all of the "required" fields of a new library user
 * and returns a new LibraryUser
 */
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
/**
 * The method gets a user by id.
 * The method returns a user.
 */
	@Override
	public LibraryUser getUserById(int id) {
		
		LibraryUser u = null;
		Query query = sf.openSession().createQuery("From LibraryUser where id= :id");
		query.setParameter("id", id);
			
		List list = query.list();
		//list.get(0);
		if (list.get(0) != null) {
			System.out.println(list);
		u =(LibraryUser) (list.get(0));
		}
		return u;
	}
/**
 * The method allows a LibraryUser to update their information
 */
	@Override
	public void updateUser(LibraryUser user) {
		Session session = sf.getCurrentSession();
		Transaction tx = session.beginTransaction();
        session.update(user);
        tx.commit();
        session.close();
		
	}
/**
 * The method allows a librarian to add a user to the LibraryUsers.
 * The method takes a user parameter and saves the user to the database.
 * 
 */
	@Override
	public void librarianAddUser(LibraryUser user) {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction(); 
		session.save(user);
		tx.commit();
		session.close();
		
	}
/**
 * The method allows a librarian to remove a user from the database.
 */

@Override
public void librarianRemoveUser(LibraryUser user) {
	Session session = sf.openSession();
	Transaction tx = session.beginTransaction(); 
	session.remove(user);
	tx.commit();
	session.close();
	
}

@Override
public boolean librarianSuspendUser(LibraryUser user) {
	Session session = sf.openSession();
	Transaction tx = session.beginTransaction(); 
	if (user.getSuspension()==0)
		user.setSuspension(1);
	else
		user.setSuspension(0);
	session.update(user);
	tx.commit();
	session.close();
	return true;
}
	

	
		
		
	

}