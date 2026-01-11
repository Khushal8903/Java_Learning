package in.com.servlet;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class myservlet extends HttpServlet{
	
	protected void doPost(HttpServletRequest req , HttpServletResponse res) throws ServletException, IOException{
		String name = req.getParameter("Name1");
		String pass = req.getParameter("Pass1");
		PrintWriter out = res.getWriter();
		if(name.equals("Khushal") && pass.equals("Pass@123")) {	
			out.println("SuccessFully Login");
		}else {
		out.println("Failed !....");
		}

	}
}
