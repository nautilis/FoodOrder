<%--
  Created by IntelliJ IDEA.
  User: p
  Date: 2017/5/4
  Time: 20:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>更新商户资料</title>
</head>
<body>

<form method="post" action="/productor/m/edit.action?id=${productor.id}" enctype="multipart/form-data" >
    <img src="/pic${productor.photo}" height="300" width="400" /><br>
    <input type="file" name="photo_file"><br>

    <label for="name">店铺名称</label><br>
    <input name="name" id="name" value="${productor.name}"><br>
    <label for="enName">英文名</label>
    <input name="enName" id="enName" value="${productor.enName}">
    <label for="email">店铺登录Email</label><br>
    <input name="email" id="email" value="${productor.email}"><br>
    <label for="openTime">经营时间</label>
    <input name="openTime"id="openTime" placeholder="13:00~00:00" value="${productor.openTime}">
    <label for="info">商铺介绍</label><br>
    <input name="info" id="info" value="${productor.info}" type="text"><br>

    <input type="submit" value="提交">


</form>

</body>
</html>
