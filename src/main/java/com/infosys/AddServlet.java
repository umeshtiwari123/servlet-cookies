package com.infosys;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet
{

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		
		int k=i+j;
		
		Cookie cookie=new Cookie("k", k+"");
		res.addCookie(cookie);
		
		res.sendRedirect("squ");
		
		
		//req.setAttribute("k", k);
		
//		RequestDispatcher rd=req.getRequestDispatcher("sq");
//		
//		rd.forward(req, res);
		
		
		
	}
}
