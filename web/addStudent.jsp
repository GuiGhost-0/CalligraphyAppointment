<%--
  Created by IntelliJ IDEA.
  User: GuiGhost
  Date: 2020/09/11
  Time: 11:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="css/basic.css">
</head>
<body>
    <form action="${pageContext.request.contextPath}/student_save" method="post">
        <table class="list_table">
            <tr>
                <th colspan="2">添加学员</th>
            </tr>
            <tr>
                <td>用户名</td>
                <td><input type="text" name="stuName"></td>
            </tr>
            <tr>
                <td>密码</td>
                <td><input type="password" name="stuPassword"></td>
            </tr>
            <tr>
                <td>性别</td>
                <td><input type="text" name="stuSex"></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="添加"></td>
            </tr>
        </table>
    </form>
</body>
</html>
