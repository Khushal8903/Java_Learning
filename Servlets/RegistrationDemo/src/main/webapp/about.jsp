<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String name =(String) session.getAttribute("uname");
%>
<!DOCTYPE html>
<html>
<head>
    <title>About</title>
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
    <h1>About Us</h1>
     <h3>Welcome   <h1><%= name %></h1>to Registration Demo </h3>
    <p>
        This project is created to understand the basics of JSP, Servlet lifecycle,
        form handling, and frontend-backend integration in Java web applications.
    </p>
</div>

</body>
</html>
