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
<%
	String path = request.getContextPath();//获取application的名称
%>
<html>
	<head>
		<title>查询教师资料</title>
		<link href="<%=path%>webapp/res/css/style.css" type="text/css" rel="stylesheet">
	</head>
	<body>
		<table width="80%" border="0" cellpadding="0" cellspacing="0" class="tableBorder_LTR">
			<tr>
				 <td height="44" colspan="6">
					&nbsp;
				 </td>
			</tr>
		</table>
		<table width="80%" border="0" align="center" cellpadding="0"
			cellspacing="0">
			<tr>
				<td width="80%" height="49" align="center">
					<form name="form1" method="post" action="searchTeacherInfo">
						<table width="520" height="50" border="0" align="center" cellpadding="0" cellspacing="0">
							<tr>
								<td><div align="center">请输入查询条件：
									<select name="condition" id="condition" tabindex="2" class="form_select">
										<option selected="true">
											姓名
										</option>
										<option>
											身份证
										</option>
										<option>
											教师编号
										</option>
									</select>
									<input name="conditionContent" type="text" id="conditionContent">
									<input type="submit" name="Submit" value="提交">
								</div>
								</td>
							</tr>
						</table>
					</form>
				</td>
			</tr>
		</table>
		<table width="90%" border="0" align="center" cellpadding="0"
			cellspacing="0">
			<!--DWLayoutTable-->
			<tr>
				<td width="760" height="362" valign="top">
					<table width="760" border="1" align="center" cellpadding="0"
						cellspacing="0">
						<!--DWLayoutTable-->
						<tr>
							<td height="28" width="100">
								<div align="center">
									教师编号
								</div>
							</td>
							<td height="28" width="100">
								<div align="center">
									姓名
								</div>
							</td>
							<td height="28" width="60">
								<div align="center">
									性别
								</div>
							</td>
							<td height="28" width="300">
								<div align="center">
									身份证
								</div>
							</td>
							<td height="28" width="100">
								<div align="center">
									授课专业
								</div>
							</td>
							<td height="28" width="100">
								<div align="center">
									维护
								</div>
							</td>
						</tr>
						<c:forEach var="tea" items="${tealist}">
							<tr>
								<td height="28">
									<div align="center">
										${tea.teiId }&nbsp;
									</div>
								</td>
								<td height="28">
									<div align="center">
										${tea.teiName }&nbsp;
									</div>
								</td>
								<td height="28">
									<div align="center">
										${tea.teiSex }&nbsp;
									</div>
								</td>
								<td height="28">
									<div align="center">
										${tea.teiSfzh }&nbsp;
									</div>
								</td>
								<td height="28">
									<div align="center">
										${tea.systemSpecialtyCode.sscName }&nbsp;
									</div>
								</td>
								<td class="button_ex" width="52" height="18">
									<div align="center">
										<a href="serviceTeacherInfo?teiId=${tea.teiId }"
											target="mainFrame">更改</a>
									</div>
								</td>
							</tr>
						</c:forEach>
					</table>
				</td>
			</tr>
		</table>
	</body>
</html>
