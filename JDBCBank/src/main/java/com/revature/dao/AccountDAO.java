package com.revature.dao;
import java.util.List;

import com.revature.beans.Account ;

public interface AccountDAO{
	public List<Account> getAccounts(int acct_owner_id);
	
	

}
