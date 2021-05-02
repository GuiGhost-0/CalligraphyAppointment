<%--
  Created by IntelliJ IDEA.
  User: GuiGhost
  Date: 2020/09/05
  Time: 15:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>xxx书法约课系统</title>
  <link rel="stylesheet" href="css/basic.css" />
</head>

<body>
<div id="main">
  <div id="logo">
    <p style="float: left;">XXX书法约课系统</p>
  </div>
  <div id="isYueke">
    <div id="teacher" onclick="window.open('teacherLogin.jsp','_self')">教师登录</div>
    <div id="adminLogin" onclick="window.open('adminLogin.jsp','_self')">Admin登录</div>
    <div id="student" onclick="window.open('studentLogin.jsp','_self')">学生登录</div>
  </div>
</div>
</body>

</html>
