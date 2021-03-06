package com.revature.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.beans.Credentials;

import com.revature.util.ConnectionUtil;

public class Req_ReimbService{
	
	public int mult2Nums(int a, int b) {
		return a*b;
			
	}
	
	
	public boolean insertReq(int userId, String description, int amount)  {
		
		
		//make connection to db ISN'T THE CONNECTION STILL IN PLACE FROM THE LOGIN?
		//CAN I TAKE THE USER ID FROM THE LOGIN AND THE INSERT IT INTO THE INSERT STATEMENT>
		//make insert sql statement
		//prepare the statement
		try {
			Credentials creds = new Credentials();// does this get the creds of the user who is logged in?
			Connection con = ConnectionUtil.getConnection();
			String sql = "INSERT INTO REIMB_REQ (USERID, DESCRIP, DOLLAR_AMT, OPEN_DATE) VALUES (?, ?, ?, SYSDATE)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,userId);
			pstmt.setString(2, description);
			pstmt.setInt(3, amount);
			pstmt.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return true;
	}
public void updateStatus(int reimb_id, int status)  {
		
		
		try {
			Connection con = ConnectionUtil.getConnection();
			String sql = "UPDATE REIMB_REQ SET APPROVAL_STATUS = ?, APPROVE_DATE = SYSDATE WHERE REIMB_ID = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,status);
			pstmt.setInt(2, reimb_id);
			pstmt.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}
