<%--
  Created by IntelliJ IDEA.
  User: GuiGhost
  Date: 2021/05/03
  Time: 13:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin管理</title>
    <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
    <script src="js/jquery-1.10.2.js"></script>
</head>
<body>
<div>
    <h1 class="h1">添加管理员</h1>
    <form class="form-horizontal" action="${pageContext.request.contextPath}/admin_saveAdmin.action">
        <div class="form-group">
            <label for="inputadminname" class="col-sm-2 control-label">用户名</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" name="adminName" id="inputadminname" placeholder="username">
            </div>
        </div>
        <div class="form-group">
            <label for="inputname" class="col-sm-2 control-label">昵称</label>
            <div class="col-sm-10">
                <input  type="text" class="form-control" id="inputname" name="name" placeholder="name">
            </div>
        </div>
        <div class="form-group">
            <label for="inputNewpwd" class="col-sm-2 control-label">输入密码</label>
            <div class="col-sm-10">
                <input type="password" class="form-control" id="inputNewpwd" name="newPwd" placeholder="NewPassword">
            </div>
        </div>
        <div class="form-group">
            <label for="inputAgainpwd" class="col-sm-2 control-label">确认密码</label>
            <div class="col-sm-10">
                <input type="password" class="form-control" id="inputAgainpwd" name="adminPassword" placeholder="AgainPassword">
                <span style="color: red;" id="msg"></span>
            </div>
        </div>
        <div class="form-group">
            <label for="inputoperator" class="col-sm-2 control-label">操作员</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="inputoperator" value="${admin.a_id}:${admin.adminName}:${admin.name}" name="operator" readonly>
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-default" id="signin">提交</button>
            </div>
        </div>
    </form>
</div>
<script>
    $(function () {
        $("#inputAgainpwd").on("blur",function () {
            var newpwd = $("#inputNewpwd").val();
            var again = $(this).val();
            if (newpwd != again){
                $("#msg").html("两次密码不一致");
                $("#signin").attr({"disabled":"disabled"});
            }else{
                $("#msg").html(null);
                $("#signin").removeAttr("disabled");
            }
        })
    })
</script>
</body>
</html>
