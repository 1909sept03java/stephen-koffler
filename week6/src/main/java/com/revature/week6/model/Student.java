package com.revature.week6.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Student {
	
	@Id
	@Column
	private int id;
	@Column(name = "FNAME")
	private String fname;
	@Column(name = "LNAME")
	private String lname;
	
	
	public Student(){
	super();
	}
	

	public Student(int id, String fname, String lname) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", fname=" + fname + ", lname=" + lname + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fname == null) ? 0 : fname.hashCode());
		result = prime * result + id;
		result = prime * result + ((lname == null) ? 0 : lname.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (fname == null) {
			if (other.fname != null)
				return false;
		} else if (!fname.equals(other.fname))
			return false;
		if (id != other.id)
			return false;
		if (lname == null) {
			if (other.lname != null)
				return false;
		} else if (!lname.equals(other.lname))
			return false;
		return true;
	}
	
}



