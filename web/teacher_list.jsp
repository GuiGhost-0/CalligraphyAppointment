<%--
  Created by IntelliJ IDEA.
  User: GuiGhost
  Date: 2020/09/10
  Time: 09:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>教师列表</title>
    <link rel="stylesheet" type="text/css" href="css/basic.css">
</head>
<body>
    <table class="list_table">
        <tr>
            <th colspan="6">xxx培训机构教师列表</th>
        </tr>
        <tr>
            <td>编号</td>
            <td>姓名</td>
            <td>专业</td>
            <td>授课时间</td>
            <td>修改</td>
            <td>删除</td>
        </tr>
        <c:forEach items="${teaList}" var="tea">
            <tr>
                <td>${tea.tea_id}</td>
                <td>${tea.teaName}</td>
                <td>${tea.major}</td>
                <td>${tea.teachTime}</td>
                <td><a href="${pageContext.request.contextPath}/teacher_update?teaId=${tea.tea_id}" target="_self"><button>修改</button></a></td>
                <td><a href="${pageContext.request.contextPath}/teacher_delete?teaId=${tea.tea_id}" target="_self"><button style="background: red" >删除</button></a></td>
            </tr>
        </c:forEach>
        <tr>
            <td colspan="6"><a href="addTeacher.jsp" target="_self"><button>添加新老师</button></a></td>
        </tr>
    </table>
</body>
</html>
