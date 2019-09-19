package com.revature.dao;

import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Account;
import com.revature.util.ConnectionUtil;

public class AccountDAOImpl implements AccountDAO {
	public List<Account> getAccounts(int acct_owner_id){
		List<Account> accounts = new ArrayList<>();
		// try-with-resources.. con will be closed at the end of the block
		try (Connection con = ConnectionUtil.getConnection()) {
			
			String sql = "SELECT * FROM ACCOUNT WHERE ACCT_OWNER_ID = ? ORDER BY ACCT_NMBR";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, acct_owner_id );
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				int acct_nmbr  = rs.getInt("ACCT_NMBR");
				double acct_bal  = rs.getDouble("ACCT_BAL");
				
				accounts.add(new Account(acct_nmbr, acct_bal, acct_owner_id));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return accounts;
		
		
	}
	

}