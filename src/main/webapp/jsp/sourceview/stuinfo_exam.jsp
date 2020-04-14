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
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>
<c:if test="${sessionScope.loginUser==null}">
	<script language="javascript">
		alert("您未登录或连线超时，请登录系统");
		window.location.href="toMain";
	</script>  
</c:if>
<html>
<script type="text/javascript" src="../../res/js/checkform.js"></script>

<link href="../../res/css/style.css" rel="stylesheet">
	<body onLoad="myform.stiId.focus();">
		<tr>
			<td height="44" colspan="6">
			&nbsp;
			</td>
		</tr>
		<form name="myform" method="post" action="regExamInfo" onsubmit="return stusourcevalid(myform)">
			<table width="59%" height="99" border="0" align="center">
				<tr>
					<td width="17%">学生编号</td>
					<td>
						<input type="text" name="stiId" onchange="window.location.href='regExamInfo?stiId='+this.value"
						value="${stuInfo.stiId }">
					</td>
					<td width="14%">学生姓名</td>
					<td>
						<input type="text" name="stiName" value="${stuInfo.stiName}">
					</td>
				</tr>
					<tr>
						<td width="17%">考试类别</td>
						<td width="33%">
							<input type="text" name="examType" value="">
						</td>
						<td width="14%">考试日期</td>
						<td width="36%">
							<input type="text" name="examDate" value="">
						</td>
					</tr>
				<tr>
					<td><div align="center">操作员</div></td>
					<td width="33%">
						<input type="text" name="czy" value="${sessionScope.loginUser.name}" readonly="readonly">
					</td>
				  <td>

				  </td>
					<td>
						<div align="left">
							<input type="submit" name="Submit" value="提交" >&nbsp;
							<input type="reset" name="Submit2" value="重置">
						</div>
					</td>
				</tr>
			</table>
			<table width="300" border="1" align="center" cellpadding="0" cellspacing="0">
			<tr>
				<td height="28" width="150"><div align="center">考试科目</div></td>
				<td height="28" width="150"><div align="center">考试成绩</div></td>
			</tr>
			<c:forEach var="list" items="${list}">
			<tr>
				<td height="28" align="center">
					<div align="center">
						<c:out value="${list.sccName}" />
					</div>
				</td>
				<td height="28" align="center">
					<div align="center">
						<input type="hidden" name="code${list.sccCode}" value="${list.sccCode}"/>
						<input type="text" name="grade${list.sccCode}" value="0.00"/>
					</div>
				</td>
			</tr>
			</c:forEach>
			</table>
		</form>
		<center><font color="red" size="4">${message}</font></center>
	</body>
</html>
