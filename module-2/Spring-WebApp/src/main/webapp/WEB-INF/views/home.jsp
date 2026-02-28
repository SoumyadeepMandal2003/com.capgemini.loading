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
    <title>Home</title>
</head>
<body>
<h1>Welcome to Spring MVC Application</h1>
<a href="${pageContext.request.contextPath}/users">View All Users</a><br/>
<a href="${pageContext.request.contextPath}/addUser">Add New User</a>
</body>
</html>