<%--
  Created by IntelliJ IDEA.
  User: GuiGhost
  Date: 2020/09/07
  Time: 15:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>xxx书法约课系统</title>
    <link rel="stylesheet" type="text/css" href="css/basic.css" />
</head>

<body bgcolor="#EEE8AA">
<div id="main">
    <div id="logo">
        <p style="float: left;">XXX书法约课系统.教师版</p>
        <p style="float: right; margin: 0px; font-size: 15px; width: 222px; padding-top: 18px;">欢迎登录...
            <font style="color: red;">${teacher.teaName}</font>老师&nbsp;&nbsp;&nbsp;&nbsp;<a href="${pageContext.request.contextPath}/login.jsp">退出</a></p>
    </div>
    <div id="students">
        <div id="title">学员约课信息</div>
        <div id="studentsInfo">
            <c:forEach items="${showInfo}" var="info">
                <div class="stu">
                    <table>
                        <tr>
                            <td>姓名</td>
                            <td>${info.stuName}</td>
                        </tr>
                        <tr>
                            <td>课程项目</td>
                            <td>${info.teaMajor}</td>
                        </tr>
                        <tr>
                            <td>授课时间</td>
                            <td>${info.teachTime}</td>
                        </tr>
                    </table>
                </div>
            </c:forEach>
        </div>
    </div>
</div>
</body>

</html>
