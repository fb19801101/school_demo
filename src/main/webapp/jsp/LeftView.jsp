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
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<script language="javascript">
	function openHref(main) {
		parent.topMenuFrame.location.href=main;
		parent.mainFrame.location.href="toMain";
		parent.leftFrame.location.href="toLeft?action="+main;
	}
</script>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
	<title>功能模块列表</title>
	<meta name="author" content="Ian Main" />
	<meta name="Copyright"
		content="Creative Commons - http://creativecommons.org/licenses/by/2.0/" />
	<link href="../res/css/left.css" rel="stylesheet">
</head>
<body>
<center>
	<div id="menu3">
		<ul>
			<!-- CSS Tabs -->
			<li><a <c:if test="${param.action=='toStudentMain'}"> id="current" </c:if>
				href="#" onClick="openHref('toStudentMain')">档案管理</a></li>

			<li><a <c:if test="${param.action=='toScoreMain'}"> id="current" </c:if>
				href="#" onClick="openHref('toScoreMain')">成绩管理</a></li>

			<li><a <c:if test="${param.action=='toTeacherMain'}"> id="current" </c:if>
				 href="#" onClick="openHref('toTeacherMain')">教职工管理</a></li>

			<li><a <c:if test="${param.action=='toBookMain'}"> id="current" </c:if>
				href="#" onClick="openHref('toBookMain')">图书馆管理</a></li>

			<li><a <c:if test="${param.action=='toSyscodeMain'}"> id="current" </c:if>
				href="#" onClick="openHref('toSyscodeMain')">代码维护</a></li>

			<li><a <c:if test="${param.action=='toUserMain'}"> id="current" </c:if>
				href="#" onClick="openHref('toUserMain')">用户维护</a></li>

			<li><a <c:if test="${param.action=='toSysInfo'}"> id="current" </c:if>
				href="#" onClick="openHref('toSysInfo')">系统信息</a></li></ul>

		<jsp:include flush="true" page="Login.jsp"></jsp:include>
	</div>
	</center>
</body>
</html>
