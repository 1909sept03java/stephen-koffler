package com.revature.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class LibraryUser {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="usersq")
	@SequenceGenerator(initialValue=1000,allocationSize=1, name="usersq", sequenceName="sq_user")
	@Column
	private int id;
	@Column
	private String username;
	@Column
	private String password;
	@Column
	private String firstname;
	@Column
	private String lastname;
	@Column
	private int ssn;
	@Column
	private String email;
	@Column
	private int superuser;
	@Column
	private int suspension;
	@Column
	private int bookborrowed;
	
	public LibraryUser() {
		super();
	}
	
	public LibraryUser(String username, String password, String firstname, String lastname, String email) {
		super();
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lasstname) {
		this.lastname = lasstname;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getSuperuser() {
		return superuser;
	}
	public void setSuperuser(int superuser) {
		this.superuser = superuser;
	}
	public int getSuspension() {
		return suspension;
	}
	public void setSuspension(int suspension) {
		this.suspension = suspension;
	}
	public int getBookborrowed() {
		return bookborrowed;
	}
	public void setBookborrowed(int bookborrowed) {
		this.bookborrowed = bookborrowed;
	}
}