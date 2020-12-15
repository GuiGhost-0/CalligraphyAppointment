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
    <form action="${pageContext.request.contextPath}/teacher_updateSuccess" method="post">
        <table class="list_table">
            <tr>
                <th colspan="2">修改教师信息</th>
            </tr>
            <tr>
                <td>编号</td>
                <td><input type="text" value="${updTea.tea_id}" readonly="readonly" name="tea_id"></td>
            </tr>
            <tr>
                <td>用户名</td>
                <td><input type="text" value="${updTea.teaName}" readonly="readonly" name="teaName"></td>
            </tr>
            <tr>
                <td>密码</td>
                <td><input type="password" value="${updTea.teaPassword}" name="teaPassword"></td>
            </tr>
            <tr>
                <td>专业</td>
                <td><input type="text" value="${updTea.major}" name="major"></td>
            </tr>
            <tr>
                <td>教学时间</td>
                <td><input type="text" value="${updTea.teachTime}" name="teachTime"></td>
            </tr>

            <tr>
                <td colspan="2"><input type="submit" value="提交"></td>
            </tr>
        </table>
    </form>
</body>
</html>
