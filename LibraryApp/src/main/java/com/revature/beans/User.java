package com.revature.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name = "LIBRARYMEMBER")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="userIdSequence")
	@SequenceGenerator(allocationSize=1, name="userIdSequence", sequenceName="SQ_USERID_PK")
	@Column(name="USER_ID")
	private int userId;
	private String fullName;
	private String passWord;
	private int isSuperUser;
	private int isLibrarian;
	
	public User() {
		super();
	}
	
	public User(String fullName, String passWord) {
		super();
		this.fullName = fullName;
		this.passWord = passWord;
		isSuperUser = 0;
		isLibrarian=0;
	}
	public User(int userId, String fullName, String passWord, int isLibrarian) {
		super();
		this.userId = userId;
		this.fullName = fullName;
		this.passWord = passWord;
		this.isLibrarian = isLibrarian;
	}
	public User(int userId, String fullName, String passWord) {
		super();
		this.userId = userId;
		this.fullName = fullName;
		this.passWord = passWord;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public int getIsSuperUser() {
		return isSuperUser;
	}

	public void setIsSuperUser(int isSuperUser) {
		this.isSuperUser = isSuperUser;
	}

	public int getIsLibrarian() {
		return isLibrarian;
	}

	public void setIsLibrarian(int isLibrarian) {
		this.isLibrarian = isLibrarian;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", fullName=" + fullName + ", passWord=" + passWord + ", isSuperUser="
				+ isSuperUser + ", isLibrarian=" + isLibrarian + "]";
	}

	
	
}
