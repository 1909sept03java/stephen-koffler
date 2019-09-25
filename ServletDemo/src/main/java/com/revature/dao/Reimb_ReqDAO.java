package com.revature.dao;
import java.util.List;

import com.revature.beans.Reimb_Req;

public interface Reimb_ReqDAO {
	public List<Reimb_Req> getAccounts(int ee_id);

}
