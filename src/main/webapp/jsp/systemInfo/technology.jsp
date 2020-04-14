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
<html>
	<head>
		<title>技术支持</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<link href="../../res/css/style.css" rel="stylesheet">
		<style type="text/css">
			.style1 {color: #0033FF}
        </style>
	</head>
	<body>
		<p>
			&nbsp;
		</p>
		<table width="90%" border="0" cellpadding="0" cellspacing="0">
			<!--DWLayoutDefaultTable-->
			<tr>
				<td width="9" height="128">
					&nbsp;
				</td>
				<td width="753" valign="top">
					<div align="center">
						<p>
							&nbsp;
						</p>
						<p>
							<%
								String path = request.getContextPath();
							%>
							<img src="<%=path%>/res/img/technology.jpg" width="610" height="70">
						</p>
						<p>
							<span class="style1">本系统由中铁十二局集团第一工程有限公司全权负责所有技术性支持</span>
						</p>
					</div>
				</td>
				<td width="12">
					&nbsp;
				</td>
			</tr>
			<tr>
				<td height="173">
					&nbsp;
				</td>
				<td valign="top">
					<p align="center">
						&nbsp;
					</p>
					<p align="center">
						公司地址：陕西省西安市灞桥区柳雪路368号
					</p>
					<p align="center">
						公司网址：www.cr121.com
					</p>
					<p align="center">
						公司信箱：zt121@cr121.com、administrator@cr121.com
					</p>
					<p align="center">
						技术支持：029-89512897
					</p>
				</td>
				<td>
					&nbsp;
				</td>
			</tr>
		</table>
	</body>
</html>
