<%--
  Created by IntelliJ IDEA.
  User:    Administrator
  author:  ��Ϣ������-����
  site:    http://www.cr121.com/
  company: ����ʮ���ּ��ŵ�һ�������޹�˾
  Date:    2020/3/4
  Time:    11:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" language="java" pageEncoding="GB2312"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<html>
<head>
	<title>�û���¼</title>
</head>
<body>
	<div align="center">
		<c:if test="${sessionScope.loginUser==null }">
			<form name="form1" method="post" action="login">
				<p>
					<span class="word_orange">�� ����</span>
					<input name="username" type="text" size="10" value="admin">
				</p>
				<p>
					<span class="word_orange">�� �룺</span>
					<input name="password" type="password" size="10" value="123456">
				</p>
				<p>
					&nbsp;&nbsp;
					<input type="submit" name="login" value="��¼">
					&nbsp;&nbsp;
					<input type="reset" name="cancel" value="ȡ��">
				</p>
				<p align="center">${message }</p>
			</form>
		</c:if>
		<c:if test="${sessionScope.loginUser!=null }">

			<p align="center">
				<span class="word_orange">��ǰ�û���${sessionScope.loginUser.name } </span></p>
			<p align="center" class="button">
				<a href="login?action=logout">�˳�</a></p>
			<p align="center">${message }</p>
		</c:if>
	</div>
</body>
</html>
