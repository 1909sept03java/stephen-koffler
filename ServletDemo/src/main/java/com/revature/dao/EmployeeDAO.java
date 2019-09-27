package com.revature.dao;

public interface EmployeeDAO {

	public void login(String userId, String password);
	public void view_HomePage(boolean manager);
	public void submit_RR(int userId, double dollar_Amt, String description);
	public void view_Pending(int userId);
	public void view_Resolved(int userId);
	public void view_Personal_Info(int userId);
	
	
}
