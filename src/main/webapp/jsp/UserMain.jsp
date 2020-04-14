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
    <title>用户管理</title>
    <link href="../res/css/main.css" rel="stylesheet">
</head>

<body>
    <div id="navigation">
        <ul>
            <c:if test="${sessionScope.loginUser!=null}">
                <!-- CSS Tabs -->
                <li <c:if test="${param.action=='oh'}"> id="current" </c:if>>
                    <a href="addUser" target="mainFrame" onClick="openHref('toUserMain?action=oh')">
                    <span>用户添加</span></a></li>

                <li <c:if test="${param.action=='us'}"> id="current" </c:if>>
                    <a href="searchUser" target="mainFrame" onClick="openHref('toUserMain?action=us')">
                    <span>用户查询</span></a></li>
            </c:if>
            <c:if test="${sessionScope.loginUser==null}">
                <li><a href="toMain" target="mainFrame"><span>您未登录或连线超时，请登录系统。</span></a></li>
            </c:if>
        </ul>
    </div>
</body>
</html>