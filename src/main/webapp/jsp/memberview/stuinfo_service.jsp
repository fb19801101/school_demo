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
<link href="../../res/css/style.css" rel="stylesheet">
  <body>
		<tr>
			<td height="44" colspan="6">
			&nbsp;
			</td>
		</tr>
  		<form action="serviceStudentInfo" name="form1" method="post">
				<br>
        <div class="form_select" align="center">
					<tr>
						<td width="154">查询条件:
							<select name="condition" id="condition" tabindex="2" class="form_select">
						    <option value="sti_id" ${selectStr=='stiId'?'selected':''}>学生编号</option>
						    <option value="sti_name" ${selectStr=='stiName'?'selected':''}>学生姓名</option>
						    <option value="sti_sfzh" ${selectStr=='stiSfzh'?'selected':''}>身份证号</option>
					      </select></td>
						  <td width="190"><input type="text" width="185" name="strvalue" value="${conValue}" /></td>
						  <td width="113"><input type="submit" name="query" value="查询"></td>
					</tr>
				</div>
		</form>   
		<table width="1200" border="1" align="center" cellpadding="0" cellspacing="0">
			<tr>
				<td height="28" width="100"><div align="center">学生编号</div></td>
				<td height="28" width="100"><div align="center">学生姓名</div></td>
				<td height="28" width="300"><div align="center">身份证号</div></td>
				<td height="28" width="300"><div align="center">出生日期 </div></td>
				<td height="28" width="300"><div align="center">家庭地址</div></td>
				<td height="28" width="100"><div align="center">维护 </div></td>
			</tr>

			<c:forEach var="sti" items="${messages}">
				<tr>
					<td height="28" align="center">
						<div align="center">
					    <c:out value="${sti.stiId}" />
						</div>
			    </td>
					<td height="28" align="center">
						<div align="center">
							<c:out value="${sti.stiName}" />
						</div>
					</td>
					<td height="28" align="center">
						<div align="center">
							<c:out value="${sti.stiSfzh}" />
						</div>
					</td>
					<td height="28" align="center">
						<div align="center">
							<spring:eval expression="sti.stiCsrq"></spring:eval>
<%--							<c:out value="${sti.stiCsrq}" />--%>
						</div>
					</td>
					<td height="28" align="center">
						<div align="center">
							<c:out value="${sti.stiJtdz}" />
						</div>
					</td>
					<td class="button_ex" width="52" height="18">
						<div align="center">
							<a href="modifyStudentInfo?stiId=${sti.stiId}"
							   target="mainFrame">更改</a>
						</div>
					</td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>
