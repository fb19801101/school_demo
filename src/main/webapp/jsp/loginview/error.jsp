<%--
  Created by IntelliJ IDEA.
  User:    Administrator
  author:  信息化管理部-方波
  site:    http://www.cr121.com/
  company: 中铁十二局集团第一工程有限公司
  Date:    2020/3/4
  Time:    11:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Error</title>
</head>
<body>
    <h1>登录失败！</h1><br>
    登录名称：<%=request.getParameter("username")%><br>
    登录密码：<%=request.getParameter("password")%><br>

    <hr>
    <div>
        <h1>查询结果:</h1><br>
        <%--需要建立对应的界面JavaBean，后台传入对象实例--%>
        消息：<input value=${message}><br>
        编号：<input value=${user.id}><br>
        名字：<input value=${user.username}><br>
        密码：<input value=${user.password}><br>

        <hr>
        <h1>ResultJson:</h1><br>
        <span>${resultJson}</span>
    </div>
</body>
</html>
