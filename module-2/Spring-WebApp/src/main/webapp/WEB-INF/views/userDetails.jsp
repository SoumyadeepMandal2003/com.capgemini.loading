<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 26-02-2026
  Time: 14:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Detail</title>
</head>
<body>
<h1>User Details</h1>
<p><strong>ID:</strong> ${user.id}</p>
<p><strong>Name:</strong> ${user.name}</p>
<p><strong>Email:</strong> ${user.email}</p>
<br/>
<a href="${pageContext.request.contextPath}/users">Back to User List</a>
</body>
</html>