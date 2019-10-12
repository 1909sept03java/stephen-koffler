package com.revature.dao;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.revature.beans.Book;
import com.revature.beans.Flashcard;
import com.revature.util.ConnectionUtil;





public class BookDAOImpl implements BookDAO {
	
	private SessionFactory sf = ConnectionUtil.getSessionFactory();

	@Override
	public Book getById(int id) {
		Book b = null;
		try (Session s = sf.openSession()) {
			b = s.get(Book.class, id);
			System.out.println(s.getStatistics());
			b.setTitle("Merlin");
		}
		return b;
	}

	@Override
	public List<Book> getByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getAll() {
		List<Book> bookList = new ArrayList<>();
		// use a Query
		
		try (Session s = sf.openSession()) {
			bookList = s.createQuery("from Book").getResultList();
			System.out.println(s.getStatistics());
		}
		return bookList;
	}

	@Override
	public boolean addBook(Book book) {
		boolean added = false;
		// try-with-resources on an AutoCloseable resource - closes at end of control
		// statement
		try (Session s = sf.openSession()) {
			// autocommit is OFF in Hibernate
			Transaction tx = s.beginTransaction();
			s.persist(book);
			tx.commit();
			added = true;
			System.out.println(s.getStatistics());
		}
		return added;
	}

	@Override
	public boolean updateBook(Book book) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteBook(Book book) {
		// TODO Auto-generated method stub
		return false;
	}

}
