<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" href="css/login.css">
</head>
<body>

<div class="main-container">
    <div class="card">
        <h2>Login</h2>
        <p class="subtitle">Welcome back! Please login</p>

        <!-- Success message after registration -->
        <%
            String msg = request.getParameter("msg");
            if ("success".equals(msg)) {
        %>
            <p class="success-msg">
                Registration successful! Please login.
            </p>
        <%
            }
        %>

        <!-- Error message -->
        <%
            String error = (String) request.getAttribute("error");
            if (error != null) {
        %>
            <p class="error-msg"><%= error %></p>
        <%
            }
        %>

        <form action="login" method="post">

            <div class="input-group">
                <input type="text" name="username" required>
                <label>Username</label>
            </div>

            <div class="input-group">
                <input type="password" name="password" required>
                <label>Password</label>
            </div>

            <button type="submit">Login</button>
        </form>

        <p class="register-link">
            Don’t have an account?
            <a href="index.jsp">Register</a>
        </p>
    </div>
</div>

</body>
</html>
