package com.revature;

import com.revature.beans.Book;
import com.revature.beans.Flashcard;
import com.revature.dao.BookDAO;
import com.revature.dao.BookDAOImpl;


public class BookDriver {

	public static void main(String[] args) {
		
		BookDAOImpl bk = new BookDAOImpl();
		
		bk.addBook(new Book("The Hobbit", "JRR Tolkein"));
		bk.addBook(new Book("The Lion, The Witch, and The Wardrobe", "CS Lewis"));
		bk.addBook(new Book("Dark Money", "Jane Mayer"));
		bk.addBook(new Book("Kitchen Confidential", "Anthony Bourdain"));
		
		for (Book b: bk.getAll()) {
		System.out.println(b);

	}

}
}
