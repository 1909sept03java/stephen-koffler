package com.revature.dao;
import com.revature.beans.User;

import java.util.List;



public interface UserDAO {
	public User getById(int id);
	public List<User> getAll();
	public boolean addUser(User user);
	public boolean updateUser(User user);
	public boolean deleteUser(User user);

}
