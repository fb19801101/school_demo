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
<c:if test="${sessionScope.loginUser==null}">
	<script language="javascript">
		alert("您未登录或连线超时，请登录系统");
		window.location.href="toMain";
	</script>  
</c:if>
<html>
	<head>
		<title>添加用户</title>
		<link href="../../res/css/style.css" rel="stylesheet">
	</head>
	<body>
		<table width="746" border="0" cellpadding="0" cellspacing="0">
			<!--DWLayoutDefaultTable-->
			<tr>
				<td width="31" height="97">
					&nbsp;
				</td>
				<td width="698">
					&nbsp;
				</td>
				<td width="17">
					&nbsp;
				</td>
			</tr>
			<tr>
				<td height="190">
					&nbsp;
				</td>
				<td valign="top">
					<div align="center">
						<p>
							<span class="word_grey"></span>
						</p>
						<form name="form1" method="post" action="addUser">
							<p>
								登录名称：
								<input type="text" name="username">
							</p>
							<p>
								登录密码：
								<input type="password" name="password">
							</p>
							<p>
								用户昵称：
								<input type="text" name="name">
							</p>
							<p>
								<input type="submit" name="Submit" value="提交">
								<input type="reset" name="Submit2" value="重置">
							</p>
						</form>
						${message }
					</div>
				</td>
			</tr>
		</table>
	</body>
</html>
