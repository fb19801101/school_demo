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
<jsp:directive.page import="java.sql.Date" />
<c:if test="${sessionScope.loginUser==null}">
	<script language="javascript">
		alert("您未登录或连线超时，请登录系统");
		window.location.href="toMain";
	</script>  
</c:if>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
		<title>任命班主任</title>
		<link href="../../res/css/style.css" rel="stylesheet">
	<script src="../../res/js/checkform.js"></script>
	</head>
	<body>
	<tr>
			 <td height="44" colspan="6">
				&nbsp;
			 </td>
		   </tr>
		<form name="myform" method="post" action="assignClassLoader" onsubmit="return checkCharge(myform)">
			<table width="80%" height="98" border="0" align="center">
				
				<tr>
					<td height="48">
						&nbsp;
					</td>
					<td colspan="2">
						<div align="right">
							请输入教师编号：
						</div>
					</td>
					<td>
						<div align="left">
							<input type="text" name="teiId" value="${teaInfo.teiId }"
								onchange="window.location.href='assignClassLoader?changeteiId='+teiId.value+'&changesciId='+sciId.value">
						</div>
					</td>
					<td>
						&nbsp;
					</td>
				</tr>
			</table>
			<br>
			<table width="80%" height="69" border="1" align="center"
				cellpadding="0" cellspacing="0">
				<tr>
					<td>
						<div align="center">
							教师姓名
						</div>
					</td>
					<td>
						<div align="center">
							性别
						</div>
					</td>
					<td>
						<div align="center">
							年龄
						</div>
					</td>
					<td>
						<div align="center">
							学历
						</div>
					</td>
					<td>
						<div align="center">
							授课专业
						</div>
					</td>
					<td>
						<div align="center">
							婚否
						</div>
					</td>
				</tr>
				<tr>
					<td>
						<div align="center">
							${teaInfo.teiName }&nbsp;
						</div>
					</td>
					<td>
						<div align="center">
							${teaInfo.teiSex }&nbsp;
						</div>
					</td>
					<td>
						<div align="center">
							${teaInfo.teiAge }&nbsp;
						</div>
					</td>
					<td>
						<div align="center">
							${teaInfo.teiXueli }&nbsp;
						</div>
					</td>
					<td>
						<div align="center">
							${teaInfo.systemSpecialtyCode.sscName }&nbsp;
						</div>
					</td>
					<td>
						<div align="center">
							${teaInfo.teiHunfou }&nbsp;
						</div>
					</td>
				</tr>
			</table>
			
			<table width="68%" height="125" border="0" align="center">
				<tr>
					<td width="15%">
						&nbsp;
					</td>
				</tr>
				<tr>
					<td>
						<div align="left">
							班级名称
						</div>
					</td>
					<td width="36%">
						<select name="sciId"
							onchange="window.location.href='assignClassLoader?changeteiId='+teiId.value+'&changesciId='+sciId.value">
							<c:forEach var="sci" items="${classInfo}">
								<option value="${sci.sciId }"
									<c:if test="${sci.sciId==rowInfo.sciId}"> selected="yes"</c:if>>
									${sci.sciName }
								</option>
							</c:forEach>
						</select>
					</td>
					<td width="11%">
						<div align="left">
							专业
						</div>
					</td>
					<td width="38%">
						<input type="text" name="sscName" readonly="yes"
							value="${rowInfo.systemSpecialtyCode.sscName }">
					</td>
				</tr>
				<tr>
					<td>
						<div align="left">
							年级
						</div>
					</td>
					<td>
						<input type="text" name="sgcName" readonly="yes"
							value="${rowInfo.systemGradeCode.sgcName }">
					</td>
					<td>
						<div align="left">
							任职日期
						</div>
					</td>
					<td>
						<input type="text" name="acsRzrq">
					</td>
				</tr>
				<tr>
					<td colspan="4">
						<div align="center">
							<input type="submit" name="Submit" value="提交">
							&nbsp;&nbsp;&nbsp;
							<input type="reset" name="Submit2" value="重置">
						</div>
					</td>
				</tr>
			</table>
			<center>
				<br>
				<c:if test="${message==null }">
					单击“提交”按钮，将教师任职为班主任。
				</c:if>
				<c:if test="${message!=null }">
					${message }
				</c:if>
			</center>
		</form>
	</body>
</html>
