<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%
String username = (String) session.getAttribute("user");
%>

<!DOCTYPE html>
<html>
<head>
<title>Home Page</title>
</head>
<body>
<h2>Welcome, <%= username %></h2>


<a href="home.jsp">Home</a> |
<a href="about.jsp">About</a>


<p>This is the Home page.</p>
</body>
</html>