<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String name = (String)session.getAttribute("uname");
%>

<!DOCTYPE html>
<html>
<head>
    <title>Home</title>
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
    <p>
        This is a simple Java web application built using JSP, Servlets, and CSS.
        It demonstrates user registration, page navigation, and clean UI design.
    </p>

    <a href="register.jsp" class="btn">Create Account</a>
</div>

</body>
</html>
