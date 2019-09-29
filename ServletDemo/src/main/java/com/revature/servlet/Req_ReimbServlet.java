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

public class Req_ReimbServlet extends HttpServlet {
//do I need to override both doGet and doPost in every servlet?
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		req.getRequestDispatcher("Req_Reimb.html").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		int userId = (int) session.getAttribute("userId");
		String description = req.getParameter("description");
		int amount = Integer.parseInt(req.getParameter("amount"));
		Req_ReimbService rr = new Req_ReimbService();
		boolean succeeded = rr.insertReq(userId, description, amount);
		if(succeeded)
			resp.sendRedirect("profile"); //change this redirect to home page which will have options for insert RR, and view status RRs
		else
			resp.sendRedirect("input_RR");
		 //
		//if succeeded redirect to a different page, probably back to profile page. if not redirect bak to reimb req page.
	}//ref line 35 - 49 in login 
}
