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
	function openHref(main,child) {
		parent.topMenuFrame.location.href=main;
		parent.mainFrame.location.href=child;
	}
</script>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>档案管理</title>
    <link href="../res/css/main.css" rel="stylesheet">
</head>
<body>
    <div id="navigation">
        <ul>
            <c:if test="${sessionScope.loginUser!=null}">
                <!-- CSS Tabs -->
                              
                <li <c:if test="${param.action=='toStudentMain'}"> id="current" </c:if>>
                    <a name="Doc" href="#" onClick="openHref('toStudentMain?action=toStudentMain','insertStudentInfo?name=cs2')">
                        <span>学生基本信息</span></a></li>

                <li <c:if test="${param.action=='Reg'}"> id="current" </c:if>>
                    <a href="#" onClick="openHref('toStudentMain?action=Reg','regStudentInfo')">
                        <span>学生入校登记</span></a></li>

                <li <c:if test="${param.action=='Modi'}"> id="current" </c:if>>
                    <a href="#" onClick="openHref('toStudentMain?action=Modi','serviceStudentInfo')">
                        <span>学生信息维护</span></a></li>

                <li <c:if test="${param.action=='RegList'}"> id="current" </c:if>>
                    <a href="#" onClick="openHref('toStudentMain?action=RegList','searchStudentRegister')">
                        <span>学生登记查询</span></a></li>

                <li <c:if test="${param.action=='regTea'}"> id="current" </c:if>>
                    <a href="#" onClick="openHref('toStudentMain?action=regTea','${pageContext.request.contextPath}/teacher/regTeacherInfo')">
                        <span>教师基本信息</span></a></li>

                <li <c:if test="${param.action=='serviceTea'}"> id="current" </c:if>>
                    <a href="#" onClick="openHref('toStudentMain?action=serviceTea','${pageContext.request.contextPath}/teacher/serviceTeacherInfo')">
                        <span>教师信息维护</span></a></li>

            </c:if>
            <c:if test="${sessionScope.loginUser==null}">
                <li><a href="toMain" target="mainFrame"><span>您未登录或连线超时，请登录系统。</span></a></li>
            </c:if>
        </ul>
    </div>
</body>
</html>