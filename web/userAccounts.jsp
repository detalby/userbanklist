
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Users Bank List</title>
</head>
<body>

<form method="get" action="get">
    The Richest Guy is <td> ${user.name} ${user.surName}</td>
    <button style="height: 25px;width: 60px;" name="get" value="rich">Get</button>
</form>

<form method="get" action="get">
    All acoounts <td><c:out value="${sum}"/></td>
    <button style="height: 25px;width: 60px;" name="get" value="sum">Get</button>
</form>

</body>
</html>
