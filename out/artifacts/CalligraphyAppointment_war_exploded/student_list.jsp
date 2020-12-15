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
    <title>学院列表列表</title>
    <link rel="stylesheet" type="text/css" href="css/basic.css">
</head>
<body>
    <table class="list_table">
        <tr>
            <th colspan="5">xxx培训机构学员列表</th>
        </tr>
        <tr>
            <td>编号</td>
            <td>姓名</td>
            <td>性别</td>
            <td>修改</td>
            <td>删除</td>
        </tr>
        <c:forEach items="${stus}" var="stu">
            <tr>
                <td>${stu.stu_id}</td>
                <td>${stu.stuName}</td>
                <td>${stu.stuSex}</td>
                <td><a href="${pageContext.request.contextPath}/student_updatePage?stuId=${stu.stu_id}"><button>修改</button></a></td>
                <td><a href="${pageContext.request.contextPath}/student_delete?stuId=${stu.stu_id}"><button style="background: red">删除</button></a></td>
            </tr>
        </c:forEach>
        <tr>
            <td colspan="5"><a href="addStudent.jsp" target="_self"><button>添加学员</button></a></td>
        </tr>
    </table>
</body>
</html>
