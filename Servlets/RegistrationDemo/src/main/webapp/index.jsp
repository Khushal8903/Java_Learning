<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String err = (String)session.getAttribute("er");
%>
<!DOCTYPE html>
<html>
<head>
    <title>User Registration</title>
    <link rel="stylesheet" href="css/registration.css">
</head>

<body>

<div class="main-container">
    <div class="card">
        <h2>Create Account</h2>
        <p class="subtitle">Please fill in your details</p>

        <form action="register" method="post">

            <div class="input-group">
                <input type="text" name="name" required>
                <label>Full Name</label>
            </div>

            <div class="input-group">
                <input type="text" name="username" required>
                <label>Username</label>
            </div>

            <div class="input-group">
                <input type="password" name="password" required>
                <label>Password</label>
            </div>

            <div class="input-group">
                <input type="number" name="age" required>
                <label>Age</label>
            </div>

            <div class="input-group">
                <input type="text" name="mobile" required>
                <label>Mobile Number</label>
            </div>

            <div class="input-group">
                <input type="email" name="email" required>
                <label>Email Address</label>
            </div>
            
			<h3> <style>color = 'red'</style> <%= err %></h3>
            <button type="submit">Register</button>
        </form>

        <!-- Login link -->
        <p class="login-link">
            Already registered?
            <a href="login.jsp">Login here</a>
        </p>

    </div>
</div>

</body>
</html>
