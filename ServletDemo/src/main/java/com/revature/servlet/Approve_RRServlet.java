package com.revature.servlet;
import java.lang.Integer;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.beans.Credentials;
import com.revature.beans.User;
import com.revature.service.Req_ReimbService;

public class Approve_RRServlet extends HttpServlet {
//do I need to override both doGet and doPost in every servlet?
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
		HttpSession session = req.getSession();
		int userId = (int) session.getAttribute("userId");
		int reimb_id = Integer.parseInt(req.getParameter("reimb_id"));
		int status = Integer.parseInt(req.getParameter("status"));
		Req_ReimbService rr = new Req_ReimbService();
		rr.updateStatus(reimb_id, status);
			resp.sendRedirect("Review_Staff_RRs"); 
		
	}
	
	
}
