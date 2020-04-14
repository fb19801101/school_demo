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
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<c:if test="${sessionScope.loginUser==null}">
	<script language="javascript">
		alert("您未登录或连线超时，请登录系统");
		window.location.href="toMain";
	</script>  
</c:if>
<html> 
<script src="../../res/js/checkform.js"></script>
<link href="../../res/css/style.css" rel="stylesheet">
<body>
	<tr>
 <td height="44" colspan="6">
	&nbsp;
 </td>
</tr>
	<form action="searchStudentRegister" name="form1" method="post" onsubmit="return checkRegList(form1)">
		&nbsp;
		<div align="center">
			<tr>
				<td width="154">查询字段:
				  <select name="select_field">
						<option value="id" ${field=='id'?'selected':''}>学生编号</option>
						<option value="djrq" ${field=='djrq'?'selected':''}>入学日期</option>
						<option value="lqfs" ${field=='lqfs'?'selected':''}>录取分数</option>
				  </select>
				  </td>
				  <td width="154">运算符:
				  <select name="select_operation">
					<option value=">" ${operation=='>'?'selected':''}>大于</option>
					<option value="<" ${operation=='<'?'selected':''}>小于</option>
					<option value="=" ${operation=='='?'selected':''}>等于</option>
				  </select>
				  </td>
				  <td width="190"><input type="text" width="185" name="condition" value="${condition}" /></td>
				  <td width="113"><input type="submit" name="query" value="查询"></td>
			</tr>
		</div>
	</form>
	<table width="1300" border="1" align="center" cellpadding="0" cellspacing="0">
		<tr>
			<td height="28" width="100"><div align="center">学生编号</div></td>
			<td height="28" width="100"><div align="center">学生姓名</div></td>
			<td height="28" width="300"><div align="center">身份证号</div></td>
			<td height="28" width="300"><div align="center">出生日期 </div></td>
			<td height="28" width="300"><div align="center">入学日期</div></td>
			<td height="28" width="100"><div align="center">录取分数</div></td>
			<td height="28" width="100"><div align="center">经办人</div></td>
		</tr>
		<c:forEach var="strinf" items="${messages}">
			<tr>
				<td height="28" align="center">
					<div align="center">
						<c:out value="${strinf['studentInfo'].stiId}" />
					</div>
				</td>
				<td height="28" align="center">
					<div align="center">
						<c:out value="${strinf['studentInfo'].stiName}" />
					</div>
				 </td>
				<td height="28" align="center">
					<div align="center">
						<c:out value="${strinf['studentInfo'].stiSfzh}"/>
					</div>
				</td>
				<td height="28" align="center">
					<div align="center">
						<spring:eval expression="strinf['studentInfo'].stiCsrq"></spring:eval>
<%--						<c:out value="${strinf['studentInfo'].stiCsrq}" />--%>
					</div>
				</td>
				 <td height="28" align="center">
					<div align="center">
						<spring:eval expression="strinf.strDjrq"></spring:eval>
<%--						<c:out value="${strinf.strDjrq}" />--%>
					</div>
				 </td>

				<td height="28" align="center">
					<div align="center">
						<c:out value="${strinf.strLqfs}" />
					</div>
				</td>
				<td height="28" align="center">
					<div align="center">
						<c:out value="${strinf.strJbr}" />
					</div>
				</td>
			</tr>
		</c:forEach>
	</table>
	<p>&nbsp;</p>
	<center><font color="red" size="4">${msg}</font></center>
</body>
</html>
