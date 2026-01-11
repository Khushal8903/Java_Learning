package in.com;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String name = req.getParameter("username");
        String pass = req.getParameter("password");

        // Null check (important)
        if ("Khushal".equals(name) && "Pass@123".equals(pass)) {

            // Create session
        	
            HttpSession session = req.getSession();
            session.setAttribute("user", name);

            // Forward to home page
            RequestDispatcher rd = req.getRequestDispatcher("/home.jsp");
            rd.forward(req, res);

        } else {
            // Forward back to login page
            RequestDispatcher rd = req.getRequestDispatcher("/index.jsp");
            rd.forward(req, res);
        }
    }
}
