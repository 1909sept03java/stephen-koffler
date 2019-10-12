package com.revature.dao;
import com.revature.beans.LibraryUser;

import java.util.List;



public interface LibraryUserDAO {
	
	public LibraryUser addUser(String username, String password, String firstname, String lastname, String email);
	public boolean updateUser(LibraryUser user);
	public LibraryUser login(String username, String password);

}
