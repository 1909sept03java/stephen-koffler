package com.libraryCatalogue.Model.DAO;

import java.util.List;

import com.libraryCatalogue.Model.Bean.LibraryUser;



public interface LibraryUserDAO {
	
	public LibraryUser addUser(String username, String password, String firstname, String lastname, String email);
	public void updateUser(LibraryUser user);//need to check which fields to use
	public LibraryUser login(String username, String password);
	public LibraryUser getUserById(int id);
	public void librarianAddUser(LibraryUser user);
	public void librarianRemoveUser(LibraryUser user);
	public boolean librarianSuspendUser(LibraryUser user);

}