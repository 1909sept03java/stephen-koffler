package com.revature.dao;

import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.revature.util.ConnectionUtil;



import com.revature.beans.Acct_Owner;

public class Acct_OwnerDAOImpl implements Acct_OwnerDAO {
	


	public Acct_Owner login(String user_name, String password) {
		Acct_Owner owner = null;
		try (Connection con = ConnectionUtil.getConnection()) {
			String sql = "SELECT ACCT_OWNER_ID FROM ACCT_OWNER WHERE USER_NAME = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, user_name);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				sql = "SELECT * FROM ACCT_OWNER WHERE PASSWORD = ? AND USER_NAME = ?";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1,password);
				pstmt.setString(2, user_name);
				rs = pstmt.executeQuery();
				if(rs.next()) {
					int acct_owner_id = rs.getInt("ACCT_OWNER_ID");
					String acct_owner_fname = rs.getString("ACCOUNT_OWNER_FNAME");
					String acct_owner_lname = rs.getString("ACCOUNT_OWNER_LNAME");
					int admin_id = rs.getInt("ADMIN_ID");
					int registered = rs.getInt("REGISTERED");
					
					
					owner = new Acct_Owner(acct_owner_id, acct_owner_fname, acct_owner_lname,admin_id,registered, password, user_name);
					
				}
				else {
					throw new InvalidInputException("Invalid password");
				}
			}
			else{
				throw new InvalidInputException("Invalid username");
			}
				
		} catch (SQLException e) {
			
			e.printStackTrace();
		} catch (InvalidInputException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return owner;
	}

}
//custom exception class to check lenght of new usernames and passwords.
class InvalidInputException extends Exception{
	InvalidInputException(String message) {
		super(message);
		
		}
	}