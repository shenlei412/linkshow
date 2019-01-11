<%@ page contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <table width="60%" border="1" cellpadding="2" cellspacing="0">
        <tr>
            <th>ID</th>
            <th>姓名</th>
            <th>密码</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${userList}" var="user">
            <tr>
                <td>${user.userId }</td>
                <td>${user.userName }</td>
                <td>${user.password }</td>
                <td></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
