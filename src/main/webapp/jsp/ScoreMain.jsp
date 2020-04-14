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
        <title>成绩管理</title>
        <link href="../res/css/main.css" rel="stylesheet">
    </head>

    <body>
        <div id="navigation">
            <ul>
                <c:if test="${sessionScope.loginUser!=null}">
                    <!-- CSS Tabs -->
                    <li <c:if test="${param.action=='rc'}"> id="current" </c:if>>
                        <a href="regExamInfo" target="mainFrame" onClick="openHref('toScoreMain?action=rc')">
                            <span>成绩录入</span></a></li>

                    <li <c:if test="${param.action=='sc'}"> id="current" </c:if>>
                        <a href="searchExamInfo" target="mainFrame"  onClick="openHref('toScoreMain?action=sc')">
                            <span>成绩查询</span></a></li>

                    <li <c:if test="${param.action=='cs'}"> id="current" </c:if>>
                        <a href="classScoreList" target="mainFrame" onClick="openHref('toScoreMain?action=cs')">
                            <span>班级成绩统计</span></a></li>

                    <li <c:if test="${param.action=='gs'}"> id="current" </c:if>>
                        <a href="gradeScoreList" target="mainFrame" onClick="openHref('toScoreMain?action=gs')">
                            <span>年级成绩统计</span></a></li>
                </c:if>
                <c:if test="${sessionScope.loginUser==null}">
                    <li><a href="toMain" target="mainFrame"><span>您未登录或连线超时，请登录系统。</span></a></li>
                </c:if>
            </ul>
        </div>
    </body>
</html>