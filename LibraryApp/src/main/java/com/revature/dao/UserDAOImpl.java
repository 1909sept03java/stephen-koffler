package com.revature.dao;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.revature.beans.User;
import com.revature.util.ConnectionUtil;

public class UserDAOImpl implements UserDAO {
	private SessionFactory sf = ConnectionUtil.getSessionFactory();

	public User getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean addUser(User user) {
		boolean added = false;
		// try-with-resources on an AutoCloseable resource - closes at end of control
		// statement
		try (Session s = sf.openSession()) {
			// autocommit is OFF in Hibernate
			Transaction tx = s.beginTransaction();
			s.persist(user);
			tx.commit();
			added = true;
			System.out.println(s.getStatistics());
		}
		return added;
	}

	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
