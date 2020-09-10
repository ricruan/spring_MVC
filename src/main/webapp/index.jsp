<%--
  Created by IntelliJ IDEA.
  User: ricruan
  Date: 2020/9/10
  Time: 9:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<a href="param/user?username=sh">点击我</a>
<%--<a href="login/getRequestBody?username=sh">点击我获取请求体</a>--%>

<form method="post" action="login/getRequestBody">
    username:<input type="text" name="username">
    password:<input type="text" name="password">
    <input type="submit" value="提交">

</form>

</body>
</html>
