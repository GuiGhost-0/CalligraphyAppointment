<%--
  Created by IntelliJ IDEA.
  User: GuiGhost
  Date: 2020/09/10
  Time: 09:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>学员约课列表</title>
    <link rel="stylesheet" type="text/css" href="css/basic.css">


</head>
<body>
<table class="list_table" style="width: 70%;">
    <tr>
        <th colspan="6">xxx培训机构约课列表</th>
    </tr>
    <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>专业</td>
        <td>授课时间</td>
        <td>授课教师</td>
        <td>预约时间</td>
    </tr>
    <c:forEach items="${yuekelist}" var="yueke">
        <tr>
            <td>${yueke.id}</td>
            <td>${yueke.stuName}</td>
            <td>${yueke.major}</td>
            <td>${yueke.teachTime}</td>
            <td>${yueke.teacher}</td>
            <td>${yueke.yuyueTime}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
