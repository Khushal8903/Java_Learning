<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String name = (String)session.getAttribute("uname");
%>
<!DOCTYPE html>
<html>
<head>
    <title>Contact</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>

<div class="navbar">
    <a href="home.jsp">Home</a>
    <a href="about.jsp">About</a>
    <a href="contact.jsp">Contact</a>
    <a href="register.jsp">Register</a>
</div>

<div class="container">
 <h1>Welcome   <h1><%= name %></h1>to Registration Demo </h1>
    <h1>Contact Us</h1>
    <p>Email: support@registrationdemo.com</p>
    <p>Phone: +91 98765 43210</p>
    <p>Location: Pune, India</p>
</div>

</body>
</html>
