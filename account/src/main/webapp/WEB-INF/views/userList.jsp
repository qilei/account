<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
</head>
<body>
<table>
    <c:forEach var="item" items="${users}">
        <tr>
            <td>${item.userId}</td>
            <td>${item.userName}</td>
            <td>${item.isOK}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
