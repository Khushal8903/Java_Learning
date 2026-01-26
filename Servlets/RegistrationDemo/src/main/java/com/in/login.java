package com.in;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class login extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String username = req.getParameter("username");
        String pass = req.getParameter("password");

        HttpSession session = req.getSession();
        session.setAttribute("uname", username);

        String sql = "SELECT * FROM register WHERE username=? AND password=?";

        try (
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/registration_demo?useSSL=false&serverTimezone=UTC",
                "root",
                "Pass@123"
            );
            PreparedStatement ps = con.prepareStatement(sql);
        ) {

            ps.setString(1, username);
            ps.setString(2, pass);

            try (ResultSet rs = ps.executeQuery()) {

                if (rs.next()) {
                    req.getRequestDispatcher("/home.jsp").forward(req, res);
                } else {
                    req.setAttribute("error", "Invalid username or password");
                    req.getRequestDispatcher("/login.jsp").forward(req, res);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
