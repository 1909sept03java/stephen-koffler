package com.revature.dao;
import com.revature.beans.LibraryUser;

import java.util.List;



public interface LibraryUserDAO {
	//public User login(String userName, String passWord);
	public LibraryUser getById(int id);
	public List<LibraryUser> getAll();
	public boolean addUser(LibraryUser user);
	public boolean updateUser(LibraryUser user);
	public boolean deleteUser(LibraryUser user);
	public LibraryUser login(String username, String password);

}
