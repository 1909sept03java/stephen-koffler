package com.revature.servlet;
import java.lang.Integer;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Credentials;
import com.revature.beans.Reimb_Req;
import com.revature.beans.User;
import com.revature.service.View_RR_StatusService;


public class Review_Staff_RR_StatusServlet extends HttpServlet {
//do I need to override both doGet and doPost in every servlet?
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		req.getRequestDispatcher("Review_Staff_RRs.html").forward(req, resp);
		
		
		 
	}//ref line 35 - 49 in login 
}