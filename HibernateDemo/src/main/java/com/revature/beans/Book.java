package com.revature.beans;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.Table;
import javax.persistence.*;

@Entity
@Table(name="BOOK")
public class Book {
	

	
	public Book(){
		super();
	}

	public Book( String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}

	public Book(int bookId, String title, String author) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="bookSequence")
	@SequenceGenerator(allocationSize=1,name="bookSequence", sequenceName="SQ_BOOK_PK")
	@Column(name="BOOK_ID")
	private int bookId;
	@Column(name="TITLE")
	private String title;
	@Column(name="AUTHOR")
	private String author;

	

	public int getBookId() {
		return bookId;
	}


	public void setBookId(int bookId) {
		this.bookId = bookId;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + "]";
	}
	
}

	
