<%--
  Created by IntelliJ IDEA.
  User: GuiGhost
  Date: 2020/09/07
  Time: 10:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>admin登录</title>
    <link rel="stylesheet" type="text/css" href="css/basic.css" />
</head>

<body bgcolor="#EEE8AA">
<div id="overall">
    <div id="teacherLogin">
        <div>
            <form action="${pageContext.request.contextPath}/admin_adminLogin.action" method="POST">
                <table>
                    <tr>
                        <th colspan="2">Admin登录</th>
                    </tr>
                    <tr>
                        <td>用户名：</td>
                        <td><input type="text" name="adminName" class="login_value" /></td>
                    </tr>
                    <tr>
                        <td>密&nbsp;&nbsp;码：</td>
                        <td><input type="password" name="adminPassword" class="login_value" /></td>
                    </tr>
                    <tr>
                        <td colspan="2"><input type="submit" value="登录" style="border-radius: 5px; width: 50px; height: 28px; border: 3px gray solid;"></td>
                    </tr>
                </table>
            </form>
        </div>

    </div>
</div>
</body>

</html>
