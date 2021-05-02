<%--
  Created by IntelliJ IDEA.
  User: GuiGhost
  Date: 2020/09/10
  Time: 09:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
<%--    <meta http-equiv="X-UA-Compatible" content="ie=edge">--%>
    <title>Admin</title>
    <link rel="stylesheet" href="css/basic.css">
    <link rel="stylesheet" href="css/sidebar.css">
    <script src="js/jquery-1.10.2.js"></script>
    <script src="js/sidebar.js"></script>
</head>

<body>
<div id="wrapper" style="left:0;">
    <!-- 侧边栏 -->
    <div class="sidebar">
        <div class="headSculpture">
            <img src="images/headSculpture.jpg" alt="">
            <p>昵称：${admin.adminName}</p>
        </div>
        <div class="option">
            <ul class="userMenu">
                <li><img src="images/works.png" alt="">
                    <p><a href="${pageContext.request.contextPath}/teacher_list" target="menuFrame">教师列表</a></p>
                </li>
                <li><img src="images/release.png" alt="">
                    <p><a href="${pageContext.request.contextPath}/student_list" target="menuFrame">学员列表</a></p>
                </li>
                <li><img src="images/collection.png" alt="">
                    <p><a href="${pageContext.request.contextPath}/yueke_list" target="menuFrame">约课信息</a></p>
                </li>
                <li><img src="images/setup.png" alt="">
                    <p><a href="${pageContext.request.contextPath}/admin_adminLogout.action" target="_top">退出</a></p>
                </li>
            </ul>
        </div>
    </div>
    <!-- 侧边栏按钮 -->
    <button></button>
    <!-- 内容区域 -->
    <div class="banner">
        <!--            <h2>原创侧边栏抽屉</h2>-->
        <iframe src="${pageContext.request.contextPath}/teacher_list" name="menuFrame" width="100%" height="100%" style="border: none"></iframe>
    </div>
</div>
</body>

</html>
