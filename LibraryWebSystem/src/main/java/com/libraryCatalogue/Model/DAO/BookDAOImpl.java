package com.libraryCatalogue.Model.DAO;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.libraryCatalogue.Model.Bean.Book;
import com.libraryCatalogue.Model.Bean.LibraryUser;
import com.libraryCatalogue.Util.ConnectionUtil;

public class BookDAOImpl implements BookDAO {
	
	private SessionFactory sf = ConnectionUtil.getSessionFactory();
	


	/**
	 * @author Zi feng Chen
	 * @return ArrayList of Books that contains name in their title
	 * Calls the internal method getAllBooks
	 * Searches thorugh the arrayList of Book and matching 'name'
	 * with the title using String.indexOf()
	 * 
	 * 
	 */

	@Override
	public ArrayList<Book> searchBookByName(String name) {
		ArrayList<Book>books = getAllBooks();
		ArrayList<Book>out = new ArrayList<Book>();
		for(Book b : books) {
			   if (b.getName().toLowerCase().indexOf(name.toLowerCase()) != -1) {
		       //    System.out.println("found keyword");
		           out.add(b);
		        } else {
		      //   System.out.println("no keyword");
		        }
		}
		return out;
	}
	/**
	 * @author Zi feng Chen
	 * @return ArrayList of Books that contains author's name in name para
	 * Calls the internal method getAllBooks
	 * Searches thorugh the arrayList of Book and matching 'author'
	 * with the author's name using String.indexOf()
	 * 
	 * 
	 */

	@Override
	public ArrayList<Book> searchBookByAuthor(String author) {
		ArrayList<Book>books = getAllBooks();
		ArrayList<Book>out = new ArrayList<Book>();
		for(Book b : books) {
				if(b.getAuthor()==null) {
					
				}
				else if (b.getAuthor().toLowerCase().indexOf(author.toLowerCase()) != -1) {
		       //    System.out.println("found keyword");
		           out.add(b);
		        } 
				else {
		      //   System.out.println("no keyword");
		        }
		}
		return out;
	}
	/**
	 * @author Zi feng Chen
	 * @return ArrayList of Books that contains the tag word within Tag
	 * Calls the internal method getAllBooks
	 */
	@Override
	public ArrayList<Book> searchBookByTag(String tag) {
		ArrayList<Book>books = getAllBooks();
		ArrayList<Book>out = new ArrayList<Book>();
		for(Book b : books) {
			if (b.getTag()==null) {
				
			}
			else if (b.getTag().toLowerCase().indexOf(tag.toLowerCase()) != -1) {
		       //    System.out.println("found keyword");
		           out.add(b);
		        } else {
		      //   System.out.println("no keyword");
		        }
		}
		return out;
	}
	@Override
	public boolean borrowBook(int userid, int bookid) {
		
		Book book = getBookById(bookid);
		LibraryUser user = getUserById(userid);
		
		
		int x = user.getBookborrowed();
		if (book!=null && user.getBookborrowed()<4 &&book.getUserid()==0) {
			Session session = sf.getCurrentSession();
			Transaction tx = session.beginTransaction();
			book.setUserid(user.getId());
			book.setReturndate(new java.util.Date());
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(book.getReturndate()); 
			calendar.add(Calendar.DAY_OF_YEAR, 14);
			book.setReturndate(new java.util.Date());
			book.setReturndate(calendar.getTime());
			user.setBookborrowed(x+1);
			session.update(user);
			session.update(book);
			tx.commit();
			session.close();	
		return true;
		}
		else
			return false;
	}
	
	@Override
	public boolean returnBook(int userid, int bookid) {

		Book book = getBookById(bookid);
		LibraryUser user = getUserById(userid);
		
		
		int x = user.getBookborrowed();
		//first condition checks if book can be returned second one checks if its the same user trying to return book
			if(book.getUserid() != 0 && book.getReturndate() != null && userid == book.getUserid()) {
			Session session = sf.getCurrentSession();
			Transaction tx = session.beginTransaction();
			book.setUserid(0);
			book.setBorrowdate(null);
			book.setReturndate(null);
			user.setBookborrowed(x-1);
			session.update(user);
			session.update(book);
			tx.commit();
			session.close();
			return true;
			} else
		return false;
		
	}
	public boolean reserveBook(LibraryUser user, Book book) { //works did not change anything 
        if (user.getBookborrowed()<5 &&book.getReserveid()==0) {
            Session session = sf.getCurrentSession();
            Transaction tx = session.beginTransaction();
            book.setReserveid(user.getId());
            book.setReservedate(book.getReturndate());
            session.update(book);
            tx.commit();
            session.close();    
        return true;
        }
        else
            return false;
    }
	/**
	 * Requests an LibraryUser u from the caller
	 * takes the primary key from u and searches the db for 
	 * any books that is borrowed from u.
	 * Takes the Query and converts it into arraylist
	 * passes an arraylist book back to caller,
	 * can be NULL
	 */
	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<Book> getBookFromUser(LibraryUser u) {
		ArrayList<Book> out = new ArrayList<Book>();
		Query query = sf.openSession().createQuery("FROM Book WHERE USERID= :USERID");
		query.setParameter("USERID", u.getId());
		out = (ArrayList<Book>) query.list();
		return out;
	}

	
	@Override
	public boolean extendBook(Book book) {
		try (Session session = sf.openSession()){
	           Query query = session.createQuery("from Book where id=:bookid");
	           query.setParameter("bookid",book.getId());
	           List list = query.getResultList();
	           book = (Book) list.get(0);
	           Calendar calendar = Calendar.getInstance();
	            calendar.setTime(book.getReturndate());
	            calendar.add(Calendar.DAY_OF_YEAR, 14);
	            book.setReturndate(calendar.getTime());
	           Transaction tx = session.beginTransaction();
	           session.saveOrUpdate(book);
	           tx.commit();
	       }
	        return false;  
	}
	//book.setReturndate(book.getReturndate().plus(4, ChronoUnit.WEEKS));
	@Override
	public boolean cancleReserve(int userid, int bookid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean changeReserve(int userid, int bookid, String date) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Book getBookById(int id) {
		Book b = null;
		Query query = sf.openSession().createQuery("From Book where id= :id");
		query.setParameter("id", id);
			
		List list = query.list();
		//list.get(0);
		if (list.size() != 0) {
			System.out.println(list);
		b = (Book) (list.get(0));
		}
		return b;
		
	}

	@Override
	public LibraryUser getUserById(int id) {
		LibraryUser u = null;
		Query query = sf.openSession().createQuery("From LibraryUser where id= :id");
		query.setParameter("id", id);
			
		List list = query.list();
		//list.get(0);
		if (list.size() != 0) {
			System.out.println(list);
		u =(LibraryUser) (list.get(0));
		}
		return u;
	}

	@Override
	public boolean librarianAddBook(int userid, String name, String author, int page, String Isbn13, String publishdate, String publisher, String tag) {
		Session session = sf.openSession();
		Book book = new Book();
		LibraryUser user = getUserById(userid);
		if (user.getSuperuser() == 1)//Librarian
			book.setName(name);
			book.setAuthor(author);
			book.setIsbn13(Isbn13);
			book.setPage(page);
			book.setPublishdate(publishdate);
			book.setPublisher(publisher);
			book.setTag(tag);
		
			Transaction tx = session.beginTransaction();
			session.save(book);
			tx.commit();
			session.close();
		

		return true;
	}

	@Override
	public void librarianRemoveBook(Book book) {
		
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction(); 
		session.remove(book);
		tx.commit();
		session.close();
		

	}	
	/**
	 * @author Zi Feng Chen
	 * @return Returns an ArrayList of all the books in ArrayList
	 * to fetch all Books from Database by
	 * getting the currentSession and then
	 * Querying a select all
	 * Takes the Query force cast and insert into list
	 * takes temp list and returns as ArrayList
	 */

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public ArrayList<Book> getAllBooks() {
		Query query = sf.openSession().createQuery("From Book");
		List<Book> list = query.list();
		ArrayList<Book> arr = (ArrayList<Book>)list;
		return arr;
	}
}