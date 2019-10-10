package com.revature.service;
import com.revature.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.hibernate.SessionFactory;

import com.revature.beans.Credentials;
import com.revature.beans.User;

public class AuthenticationService {
	
	private SessionFactory sf = ConnectionUtil.getSessionFactory();
	
	// if credentials are not recognized, return null
	// if they are, return user associated with them
	public User authenticateUser(Credentials creds) {
		User u = null;
//		try (Connection con = ConnectionUtil.getConnection()) {
//			String sql = "SELECT USERID FROM EMPLOYEE WHERE USERNAME = ?";
//			PreparedStatement pstmt = con.prepareStatement(sql);
//			pstmt.setString(1, creds.getUsername());
//			ResultSet rs = pstmt.executeQuery();
//			if(rs.next()) {
//				sql = "SELECT * FROM EMPLOYEE WHERE PASSWORD = ? AND USERNAME = ?";
//				pstmt = con.prepareStatement(sql);
//				pstmt.setString(1, creds.getPassword());
//				pstmt.setString(2, creds.getUsername());
//				rs = pstmt.executeQuery();
//				if(rs.next()) {
//					int userId = rs.getInt("USERID");
//					String fname = rs.getString("FNAME");		
//					String lname = rs.getString("LNAME");
//					int isManager = rs.getInt("ISMGR");
//					u = new User(userId, fname, lname, isManager);
//				}
//			}
//			
//		}catch (SQLException e) {
//			
//			e.printStackTrace();
//		
//		}
//		return u;
	}
}
	

	
