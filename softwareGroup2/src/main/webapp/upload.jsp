<%--
  Created by IntelliJ IDEA.
  User: Sunny
  Date: 2019/5/19
  Time: 14:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${ctx}/transfer/upload" method="post" enctype="multipart/form-data">
    文件：
    <input type="file" name="file"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
