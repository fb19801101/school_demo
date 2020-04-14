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
    <link href="res/css/main.css" rel="stylesheet">
    <title>校园管理系统</title>
  </head>

<frameset rows="110,370*" framespacing="0" frameborder="NO" border="0">
  <frame src="main/toTitle" name="topFrame" scrolling="NO" noresize>
    <frameset cols="270,*" frameborder="NO" border="0" framespacing="0">
      <frame src="main/toLeft" name="leftFrame" scrolling="NO" noresize>
        <frameset rows="34,336*" framespacing="0" frameborder="NO" border="0">
        <frame src="main/toTop" name="topMenuFrame" scrolling="NO" noresize>
      <frame src="main/toMain" name="mainFrame">
      </frameset>
    </frameset>
  </frameset>
<noframes>
  <body>
<%--        <jsp:forward page="main/toLogin"></jsp:forward>--%>
  </body>
</noframes>
</html>