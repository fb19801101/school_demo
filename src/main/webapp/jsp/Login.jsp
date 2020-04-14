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
<%@ page import="java.util.*" language="java" pageEncoding="GB2312"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<html>
<head>
	<title>用户登录</title>
</head>
<body>
	<div align="center">
		<c:if test="${sessionScope.loginUser==null }">
			<form name="form1" method="post" action="login">
				<p>
					<span class="word_orange">用 户：</span>
					<input name="username" type="text" size="10" value="admin">
				</p>
				<p>
					<span class="word_orange">密 码：</span>
					<input name="password" type="password" size="10" value="123456">
				</p>
				<p>
					&nbsp;&nbsp;
					<input type="submit" name="login" value="登录">
					&nbsp;&nbsp;
					<input type="reset" name="cancel" value="取消">
				</p>
				<p align="center">${message }</p>
			</form>
		</c:if>
		<c:if test="${sessionScope.loginUser!=null }">

			<p align="center">
				<span class="word_orange">当前用户：${sessionScope.loginUser.name } </span></p>
			<p align="center" class="button">
				<a href="login?action=logout">退出</a></p>
			<p align="center">${message }</p>
		</c:if>
	</div>
</body>
</html>
