package com.in;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class servlet extends HttpServlet {

	//protected void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		String name = req.getParameter("username");
		String pass = req.getParameter("password");
		PrintWriter out = res.getWriter();
		if (name.equals("Khushal") && pass.equals("Pass@123")) {
			RequestDispatcher rd = req.getRequestDispatcher("/google.jsp");
			rd.forward(req, res);
		} else {
			 // Set error message
	        req.setAttribute("errorMsg", "Invalid UserId or Password");

			RequestDispatcher rd = req.getRequestDispatcher("/index.jsp");
			rd.forward(req, res);
		}
	}

}
