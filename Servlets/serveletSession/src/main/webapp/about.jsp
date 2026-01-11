<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%
String username = (String) session.getAttribute("user");
%>
<!DOCTYPE html>
<html>
<head>
<title>About Page</title>
</head>
<body>
<h2>About Page</h2>


<a href="home.jsp">Home</a> |
<a href="about.jsp">About</a>


<p>Hello <b><%= username %></b>, this is the About page.</p>
</body>
</html>