<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Google Redirect</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>

<div class="login-box">
    <h2>Login with Google</h2>

    <!-- Google Redirect Button -->
    <form action="googleLogin" method="get">
    <input type="text" name="search" placeholder="Type your search query..." required>
        <button type="submit" class="btn google-btn">
            Go To Google
        </button>
    </form>

</div>

</body>
</html>
