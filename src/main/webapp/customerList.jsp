<%--
  Created by IntelliJ IDEA.
  User: tranminhloc
  Date: 28/02/2024
  Time: 22:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>DANH SACH </h1>
<table>
    <tr>
        <td>ID</td>
        <td>Name</td>
        <td>Email</td>
        <td>Phone</td>
    </tr>
    <c:forEach items="${customers}" var="kh">
        <tr>
            <td>${kh.id}</td>
            <td>${kh.name}</td>
            <td>${kh.email}</td>
            <td>${kh.phone}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
