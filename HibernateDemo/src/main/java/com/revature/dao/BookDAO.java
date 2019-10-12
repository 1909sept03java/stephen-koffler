package com.revature.dao;
import java.util.List;
import com.revature.beans.Book;
import com.revature.beans.Flashcard;

public interface BookDAO {
	
	public Book getById(int id);
	public List<Book> getByTitle(String title);
	public List<Book> getAll();
	public boolean addBook(Book book);
	public boolean updateBook(Book book);
	public boolean deleteBook(Book book);

}
