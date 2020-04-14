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
		<title>教职任课</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<link href="../../res/css/style.css" rel="stylesheet">
	</head>
	<script src="../../res/js/checkform.js"></script>
	<body>
	<tr>
			 <td height="44" colspan="6">
				&nbsp;
			 </td>
		   </tr>
		<form name="myform" method="post" action="assignCourseLoader" onsubmit="return checkCourse(myform)">
			<table width="80%" height="123" border="0" align="center">
				<tr>
					<td height="44" colspan="6">
						<div align="center">
							≡≡≡
							<span class="word_grey">教职任课 </span>≡≡≡
						</div>
					</td>
				</tr>
				<tr>
					<td height="73">
						教师编号：
					</td>
					<td>
						<input type="text" name="teiId" maxlength="4" size="6"
							value="${teaInfo.teiId }"
							onchange="window.location.href='assignCourseLoader?teiId='+this.value">
						<div align="right">
						</div>
					</td>
					<td>
						任课科目：
					</td>
					<td>
						<select name="sccCode">
							<c:forEach var="scc" items="${list }">
								<option value="${scc.sccCode }">
									${scc.sccName }
								</option>
							</c:forEach>
						</select>
					</td>
					<td>
						任职日期
					</td>
					<td>
						<input type="text" name="aceRzrq" size="12">
					</td>
				</tr>
			</table>
			<br>
			<table width="80%" height="99" border="1" align="center"
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
							${teaInfo.systemSpecialtyCode.sscName}&nbsp;
						</div>
					</td>
					<td>
						<div align="center">
							${teaInfo.teiHunfou }&nbsp;
						</div>
					</td>
				</tr>
			</table>
			<br>
			
			<table width="70%" height="55" border="0" align="center">
				<tr>
					<td height="51">
						<div align="right">
							<input type="submit" name="Submit" value="提交">
						</div>
					</td>
					<td>
						&nbsp;
					</td>
					<td>
						<input type="reset" name="Submit2" value="重置">
					</td>
				</tr>
				<tr>
					<td colspan="6" align="center">
						${message }&nbsp;
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>
