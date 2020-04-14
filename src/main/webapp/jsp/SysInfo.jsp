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
<title>系统信息</title>
<link href="../res/css/main.css" rel="stylesheet">
</head>

<body>
    <div id="navigation">
        <ul>
            <!-- CSS Tabs -->
            <li <c:if test="${param.action=='copyright'}"> id="current" </c:if>>
                <a href="toCopyright" target="mainFrame" onClick="openHref('toSysInfo?action=copyright')">
                    <span>版权声明</span></a></li>

            <li <c:if test="${param.action=='technic'}"> id="current" </c:if>>
                <a href="toTechnology" target="mainFrame" onClick="openHref('toSysInfo?action=technic')">
                    <span>技术支持</span></a></li>
        </ul>
    </div>
</body>
</html>