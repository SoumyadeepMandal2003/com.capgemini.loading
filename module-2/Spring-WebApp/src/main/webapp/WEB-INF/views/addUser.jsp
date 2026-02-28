<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 26-02-2026
  Time: 12:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add User</title>
</head>
<body>
<h1>Add New User</h1>
<form action="${pageContext.request.contextPath}/addUser" method="post">
    <label>Name:</label>
    <input type="text" name="name" required/><br/><br/>
    <label>Email:</label>
    <input type="email" name="email" required/><br/><br/>
    <input type="submit" value="Add User"/>
</form>
<br/>
<a href="${pageContext.request.contextPath}/">Back to Home</a>
</body>
</html>