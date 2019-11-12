package com.libraryCatalogue.Service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.libraryCatalogue.Model.Bean.Book;
import com.libraryCatalogue.Model.Bean.LibraryUser;
import com.libraryCatalogue.Model.DAO.BookDAO;
import com.libraryCatalogue.Model.DAO.BookDAOImpl;
import com.libraryCatalogue.Model.DAO.LibraryUserDAO;
import com.libraryCatalogue.Model.DAO.LibraryUserDAOImpl;
@Service
public class BookService {
	public BookService() {
		// TODO Auto-generated constructor stub
	}

	BookDAO bookDAO = new BookDAOImpl();

	//get by id
	public LibraryUser getUserById(int id) {		
		LibraryUser user = null;
		user = this.bookDAO.getUserById(id);
		user.setId(id);
		System.out.println("bookservice class method " + user);
		return user;
	}

	public Book getBookById(int id) {
		Book book = null;
		book = this.bookDAO.getBookById(id);
		book.setId(id);
		System.out.println("book service: " + book);
		return book;

	}
	
	/**
	 * @author Zifeng Chen 
	 * @param method The Control of the conditional flow
	 * accepted words: author,tag,title
	 * @param key The search parameters to be passed in
	 * @return ArrayList of Books that contains the Queried Data
	 */
	public ArrayList<Book> searchBook(String method,String key){
		if(method.equals("author")) 
			return this.bookDAO.searchBookByAuthor(key);
		else if(method.equals("tag")) 
			return this.bookDAO.searchBookByTag(key);
		else if(method.equals("title")) 
			return this.bookDAO.searchBookByName(key);
		else
			return null;
	}
	


	
	//dont need obj good to go
	public boolean borrowBook(int userid, int bookid) {
		boolean check = false;
		Book book = new Book();
		if(this.bookDAO.borrowBook(userid, bookid) == true) {
			book.setUserid(userid);
			book.setId(bookid);
			check = true;
			System.out.println(check);
			return check;
		}
		System.out.println(check);
		return check;
	}
	public boolean reserveBook(int userid, int bookid) {  //works didnt need to touch DAO
		boolean check = false;
		Book book = this.bookDAO.getBookById(bookid);
		LibraryUser user = this.bookDAO.getUserById(userid);
		
		if (this.bookDAO.reserveBook(user,book) == true) {
		check = true;
		System.out.println(check);
		} else
			System.out.println(check);
		return false;
	}
	
	public boolean returnBook(int userid, int bookid) { //works but modified dao by adding if statement
		boolean check = false;	
		//Book book = new Book();
		//book.setUserid(userid);
	//	book.setId(bookid);
	//	System.out.println(book.getUserid() + " " + book.getId());
		// check if book can be returned
		//check if userid is same as person returning
	//	 LibraryUser checkid = this.bookDAO.getUserById(userid);
		//check to see if book can be returned
	//	if(book.getUserid() == 0) {
		//	System.out.println(check);
		//	return check;
	//	} else
		if(userid != 0 && bookid != 0) {
		this.bookDAO.returnBook(userid,bookid);
		check = true;
		System.out.println(check);
		return check;
		} else
			return false;
	}
	
	public boolean extendBook(int userid, int bookid) { //done
		boolean check = false;
		Book b = this.bookDAO.getBookById(bookid);
		
		if(b.getUserid()==userid && b.getReturndate() != null  && b.getBorrowdate() != null) {
		this.bookDAO.extendBook(b);
		check = true;
		return true;
		}
		System.out.println(check);
		return false;
	} 
	
	
	public ArrayList<Book> listBookFromUser(LibraryUser u) {

		return this.bookDAO.getBookFromUser(u);
	}
	/*
	 * Entendbook is not implemented
	public String extendBook(int userid, int bookid, int date) {
		String book = null;
		book = this.bookDAO.extendBook(userid,bookid,date);
		System.out.println(book);
		return book;
		
	}
	*/
	//this one is fine w/o book obj
	public boolean librarianAddBook(int userid, String name, String author, int page, String Isbn13, String publishdate, String publisher, String tag) {
		boolean check = false;
		if(this.bookDAO.librarianAddBook(userid, name, author, page, Isbn13, publishdate, publisher, tag) == true) {
			check = true;
			System.out.println(check);
			return check;
		}
		System.out.println(check);
		return check;
	}
	
	public ArrayList<Book> getBookFromUser(LibraryUser u) {
		ArrayList<Book> book = null;
		System.out.println(u.getBookborrowed());
		if( u.getBookborrowed() < 0) {
			return null;
		} else
		book = this.bookDAO.getBookFromUser(u);
		for(Book b:book) {
			System.out.println(b.toString());
		}
			return book;
	}


	public void librarianRemoveBook(int bookid) {
		Book book = this.bookDAO.getBookById(bookid);
		if(this.bookDAO.getBookById(book.getId()) != null) { //check if bookid exisits
		this.bookDAO.librarianRemoveBook(book);
		System.out.println(book);
		}else
		System.out.println("failed");
	}
	
	
	
	
}