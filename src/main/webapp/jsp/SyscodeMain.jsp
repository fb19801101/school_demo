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
	<title>班级编码管理</title>
	<link href="../res/css/main.css" rel="stylesheet">
</head>

<body>
	<div id="navigation">
		<ul>
			<c:if test="${sessionScope.loginUser!=null}">
				<!-- CSS Tabs -->
				<li <c:if test="${param.action=='sp'}"> id="current" </c:if>>
					<a href="lCode?name=ssc" target="mainFrame" onClick="openHref('toSyscodeMain?action=ssc')">
						<span>专业代码维护</span></a></li>

				<li <c:if test="${param.action=='gb'}"> id="current" </c:if>>
					<a href="lCode?name=sgc" target="mainFrame" onClick="openHref('toSyscodeMain?action=sgc')">
						<span>年级代码维护</span></a></li>

				<li <c:if test="${param.action=='cb'}"> id="current" </c:if>>
					<a href="lCode?name=sci" target="mainFrame" onClick="openHref('toSyscodeMain?action=sci')">
						<span>班级代码维护</span></a></li>

				<li <c:if test="${param.action=='sb'}"> id="current" </c:if>>
					<a href="lCode?name=scc" target="mainFrame" onClick="openHref('toSyscodeMain?action=scc')">
						<span>学科代码维护</span></a></li>
			</c:if>
			<c:if test="${sessionScope.loginUser==null}">
				<li><a href="toMain" target="mainFrame"><span>您未登录或连线超时，请登录系统。</span></a></li>
			</c:if>
		</ul>
	</div>
</body>
</html>
