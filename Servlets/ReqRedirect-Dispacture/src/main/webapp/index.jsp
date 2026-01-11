<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" href="index.css">
</head>
<body>

<div class="login-container">

    <form action="login" method="post">
        <label>Username</label>
        <input type="text" name="username">

        <label>Password</label>
        <input type="password" name="password">

        <button type="submit">Login</button>
    </form>

    <!-- Show error message -->
    <%
        String msg = (String) request.getAttribute("errorMsg");
        if (msg != null) {
    %>
        <p class="error-msg"><%= msg %></p>
    <%
        }
    %>

</div>

</body>
</html>
