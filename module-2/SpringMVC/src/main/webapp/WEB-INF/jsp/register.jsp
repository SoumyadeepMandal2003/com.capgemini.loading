<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 25-02-2026
  Time: 12:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head><title>Register</title></head>
<body>
<h2>Registration Form</h2>
<form action="/register" method="post">
    Name: <input type="text" name="name" required/><br/>
    Email: <input type="email" name="email" required/><br/>
    <button type="submit">Register</button>
</form>
</body>
</html>