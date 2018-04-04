<%--<html>
<body>
<h2>Hello World!</h2>
</body>
</html>
--%>

<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">
    <link rel="stylesheet" href="./css/style.css" type="text/css">

    <title>Login</title>

</head>

<body>
<h2 style="text-align:center;margin-left:auto;margin-right:auto;color:red;">Login</h2>

<div id="loginForm">
    <form action="login" method="post">
         用户名：<input type="text" name="myuser.username"><br>
         密  码：  <input type="password" name="myuser.password"><br>
                <input type="submit" value="登录"/>
    <form>
</div>

</body>
</html>
