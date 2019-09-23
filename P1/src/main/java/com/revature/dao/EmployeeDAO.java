package com.revature.dao;

public interface EmployeeDAO {

	public void login(String ee_id, String password);
	public void view_HomePage(boolean manager);
	public void submit_RR(int ee_id, double dollar_Amt, String description);
	public void view_Pending(int ee_id);
	public void view_Resolved(int ee_id);
	public void view_Personal_Info(int ee_id);
	
	
}
