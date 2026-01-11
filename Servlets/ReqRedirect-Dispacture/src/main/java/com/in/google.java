package com.in;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/googleLogin")
public class google extends HttpServlet  {
	
	protected void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException {
		String search1 = req.getParameter("search");
		//res.sendRedirect("https://www.google.com/");
		res.sendRedirect("https://www.google.com/search?q=" + search1);
	}
}
