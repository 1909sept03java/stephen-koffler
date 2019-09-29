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
				Date openDate = rs.getDate("OPEN_DATE");
				Date approvedDate = rs.getDate("APPROVE_DATE");
				int status = rs.getInt("APPROVAL_STATUS");
						
				
				
				
				rrs.add(new Reimb_Req(reimb_id, userId, description, dollarAmt, openDate, approvedDate, status));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return rrs;
	}

}
