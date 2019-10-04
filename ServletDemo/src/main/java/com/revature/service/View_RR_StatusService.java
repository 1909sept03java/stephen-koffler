package com.revature.service;


import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Credentials;
import com.revature.beans.Reimb_Req;
import com.revature.util.ConnectionUtil;

public class View_RR_StatusService{
	
	public List<Reimb_Req> checkStatus(int userId){
		
		List<Reimb_Req> rrs = new ArrayList<>();
		// try-with-resources.. con will be closed at the end of the block
		try (Connection con = ConnectionUtil.getConnection()) {
			
			String sql = "SELECT * FROM REIMB_REQ WHERE USERID = ? ORDER BY REIMB_ID";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, userId );
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				int reimb_id  = rs.getInt("REIMB_ID");
				int dollarAmt = rs.getInt("DOLLAR_AMT");
				String description = rs.getString("DESCRIP");
				String openDate = rs.getDate("OPEN_DATE").toString();
				String approvedDate = null;
				if (rs.getDate("APPROVE_DATE") != null)
					approvedDate = rs.getDate("APPROVE_DATE").toString();
				int status = rs.getInt("APPROVAL_STATUS");
				System.out.println(openDate);
						
		//I don't see where this method is being called. The servlet class just has a redirect.
		//did it get corrupted? my back up in github has a vr object calling the method. but view_rr from 
		//the employee homepage works with just the redirect.
				
				
				rrs.add(new Reimb_Req(reimb_id, userId, description, dollarAmt, openDate, approvedDate, status));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return rrs;
	}
public List<Reimb_Req> checkStaffStatus(int userId){
		
		List<Reimb_Req> rrs = new ArrayList<>();
		// try-with-resources.. con will be closed at the end of the block
		try (Connection con = ConnectionUtil.getConnection()) {
			
			String sql = "SELECT REIMB_REQ.REIMB_ID, REIMB_REQ.DESCRIP, REIMB_REQ.DOLLAR_AMT, REIMB_REQ.OPEN_DATE, REIMB_REQ.APPROVE_DATE, " + 
					"REIMB_REQ.APPROVAL_STATUS, EMPLOYEE.LNAME, EMPLOYEE.MGRID FROM REIMB_REQ INNER JOIN EMPLOYEE ON REIMB_REQ.USERID = EMPLOYEE.USERID " + 
					"WHERE MGRID = ? AND APPROVAL_STATUS IS NULL";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, userId);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				int reimb_id  = rs.getInt("REIMB_ID");
				int dollarAmt = rs.getInt("DOLLAR_AMT");
				String description = rs.getString("DESCRIP");
				String openDate = rs.getDate("OPEN_DATE").toString();
				String approvedDate = null;
				if (rs.getDate("APPROVE_DATE") != null)
					approvedDate = rs.getDate("APPROVE_DATE").toString();
				int status = rs.getInt("APPROVAL_STATUS");
				System.out.println(openDate);
						
				
				
				
				rrs.add(new Reimb_Req(reimb_id, userId, description, dollarAmt, openDate, approvedDate, status));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return rrs;
	}
}

