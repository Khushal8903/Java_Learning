package com.in;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.sql.*;

@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String username = request.getParameter("username");
        String pass = request.getParameter("password");
        String age = request.getParameter("age");
        String mobile = request.getParameter("mobile");
        String email = request.getParameter("email");

        // Validation
        if (name.isEmpty() || username.isEmpty() || pass.isEmpty()) {
            request.setAttribute("error", "All fields are required!");
            request.getRequestDispatcher("index.jsp").forward(request, response);
            return;
        }

        String sql = "INSERT INTO register (name, password, username, age, mobile, email) VALUES (?, ?, ?, ?, ?, ?)";

        try (
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/registration_demo?useSSL=false&serverTimezone=UTC",
                "root",
                "Pass@123"
            );
            PreparedStatement ps = con.prepareStatement(sql);
        ) {

            ps.setString(1, name);
            ps.setString(2, pass);
            ps.setString(3, username);
            ps.setString(4, age);
            ps.setString(5, mobile);
            ps.setString(6, email);

            int count = ps.executeUpdate();

            if (count > 0) {
                response.sendRedirect("login.jsp?msg=success");
            } else {
                request.setAttribute("error", "Registration failed!");
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }

        } catch (SQLIntegrityConstraintViolationException e) {
            // Duplicate username/email
            request.setAttribute("error", "User already exists!");
            request.getRequestDispatcher("index.jsp").forward(request, response);

        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("error", "Something went wrong. Please try again.");
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    }
}
