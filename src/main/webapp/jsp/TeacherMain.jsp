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
	}
</script>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>教师管理</title>
	<link href="../res/css/main.css" rel="stylesheet">
</head>

<body>
	<div id="navigation">
		<ul>
			<c:if test="${sessionScope.loginUser!=null&&sessionScope.loginUser.username=='admin' }">
				<!-- CSS Tabs -->
				<li <c:if test="${param.action=='se'}"> id="current" </c:if>>
					<a href="assignCourseLoader" target="mainFrame" onClick="openHref('toTeacherMain?action=se')">
						<span>教职任课</span></a></li>

				<li <c:if test="${param.action=='ce'}"> id="current" </c:if>>
					<a href="assignClassLoader" target="mainFrame" onClick="openHref('toTeacherMain?action=ce')">
						<span>任班主任</span></a></li>

				<li <c:if test="${param.action=='stc'}"> id="current" </c:if>>
					<a href="searchCourseLoader" target="mainFrame" onClick="openHref('toTeacherMain?action=stc')">
						<span>任课教师查询</span></a></li>

				<li <c:if test="${param.action=='sce'}"> id="current" </c:if>>
					<a href="searchClassLoader" target="mainFrame" onClick="openHref('toTeacherMain?action=sce')">
						<span>班主任查询</span></a></li>
			</c:if>
			<c:if test="${sessionScope.loginUser==null||sessionScope.loginUser.username!='admin' }">
				<li><a href="toMain" target="mainFrame"><span>您未登录或权限不够，请重新登录系统。</span></a></li>
			</c:if>
		</ul>
	</div>
</body>
</html>
