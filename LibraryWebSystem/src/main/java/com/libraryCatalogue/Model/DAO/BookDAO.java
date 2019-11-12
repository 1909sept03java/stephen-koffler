package com.libraryCatalogue.Model.DAO;
import java.util.ArrayList;

import com.libraryCatalogue.Model.Bean.Book;
import com.libraryCatalogue.Model.Bean.LibraryUser;

public interface BookDAO {

	// 1.1st borrow: user can keep the book 30days.
	// 2.extension: user can extend the book in total another 30 days.
	// 3.the current reservation cant be late than 90 days.
	// 4.the extension cant conflict with current reservation.
	// 5.date formate: yy-mm-dd.

	// search all books on keywords
	// each String[] contain books info plus borrowable and reservable date
	
	public ArrayList<Book> getAllBooks(); //Method add by Zi
	
	public ArrayList<Book> searchBookByName(String name);

	public ArrayList<Book> searchBookByAuthor(String author);

	public ArrayList<Book> searchBookByTag(String tag);

	public boolean borrowBook(int userid, int bookid);

	public boolean reserveBook(LibraryUser user, Book book);

	////////////////////////////////////////////////////////////

	// list user borrowed books
	// each String[] contain books info plus available extension day
	// and reserved day.
	public ArrayList<Book> getBookFromUser(LibraryUser u);

	public boolean returnBook(int userid, int bookid);

	public boolean extendBook(Book book);

	public boolean cancleReserve(int userid, int bookid);

	public boolean changeReserve(int userid, int bookid, String date);
	
	public Book getBookById(int bookid); 
	
	public LibraryUser getUserById(int userid);
	
	public boolean librarianAddBook(int userid, String name, String author, int page, String Isbn13, String publishdate, String publisher, String tag);
	
	public void librarianRemoveBook(Book book);
	
	
	

//------------------------------- not in calebs method
////public void reserveBook(int userid, int bookid, String date);
//
//public ArrayList<Book> listBook(int userid);
//
//public boolean extendBook(Book b);
//
//public void cancleReserve(int bookid);
//
//public void changeReserve(int bookid, Date date);
//



	
	

}
