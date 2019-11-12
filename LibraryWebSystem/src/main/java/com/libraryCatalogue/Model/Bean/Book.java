package com.libraryCatalogue.Model.Bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="booksq")
	@SequenceGenerator(initialValue=1000,allocationSize=1, name="booksq", sequenceName="SQ_book")
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private String isbn13;
	@Column
	private String author;
	@Column
	private String publisher;
	@Column
	private String publishdate;
	@Column
	private int    page;
	@Column
	private String tag;
	@Column
	private int    userid;
	@Column
	private Date borrowdate;
	@Column
	private Date returndate;
	@Column
	private Date reservedate;
	@Column
	private int reserveid;
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIsbn13() {
		return isbn13;
	}
	public void setIsbn13(String isbn13) {
		this.isbn13 = isbn13;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getPublishdate() {
		return publishdate;
	}
	public void setPublishdate(String publishdate) {
		this.publishdate = publishdate;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public Date getBorrowdate() {
		return borrowdate;
	}
	public void setBorrowdate(Date borrowdate) {
		this.borrowdate = borrowdate;
	}
	public Date getReturndate() {
		return returndate;
	}
	public void setReturndate(Date returndate) {
		this.returndate = returndate;
	}
	public Date getReservedate() {
		return reservedate;
	}
	public void setReservedate(Date reservedate) {
		this.reservedate = reservedate;
	}
	public int getReserveid() {
		return reserveid;
	}
	public void setReserveid(int reserveid) {
		this.reserveid = reserveid;
	
}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", isbn13=" + isbn13 + ", author=" + author + ", publisher="
				+ publisher + ", publishdate=" + publishdate + ", page=" + page + ", tag=" + tag + ", userid=" + userid
				+ ", borrowdate=" + borrowdate + ", returndate=" + returndate + ", reservedate=" + reservedate
				+ ", reserveid=" + reserveid + "]";
	}
}