package com.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class PrincipalLogin extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		
		if(username.equals("Principal123")&&password.equals("Prasad@479")) {
			RequestDispatcher rd=req.getRequestDispatcher("/School_Management.jsp");
			rd.forward(req, resp);
		}else {
			RequestDispatcher rd=req.getRequestDispatcher("/WrongUserOrPass.jsp");
			rd.include(req, resp);
		}
	}
}
