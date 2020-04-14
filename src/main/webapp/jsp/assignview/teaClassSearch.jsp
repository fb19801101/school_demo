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
		<title>班主任查询</title>
		<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
		<link href="../../res/css/style.css" rel="stylesheet">
	</head>
	<body>
		<table width="90%" border="0" cellpadding="0" cellspacing="0">
			<tr>
				<td height="40" align="center">
					<div align="center">
						<p>
							
						</p>
					</div>
				</td>
			</tr>
		</table>
		<table width="90%" border="0" align="center" cellpadding="0"
			cellspacing="0">
			<tr>
				<td width="100%" height="49" align="center">
					<form name="myform" method="post"
						action="searchClassLoader">
						请输入查询条件：
						<select name="condition" id="condition" tabindex="2">
							<option value="systemClassInfo.systemSpecialtyCode.sscName"
								<c:if test="${condition=='systemClassInfo.systemSpecialtyCode.sscName' }"> selected="yes"</c:if>>
								专业
							</option>
							<option value="systemClassInfo.systemGradeCode.sgcName"
								<c:if test="${condition=='systemClassInfo.systemGradeCode.sgcName' }"> selected="yes"</c:if>>
								年级
							</option>
						</select>
						<input name="conditionContent" type="text" id="conditionContent"
							value="${conditionContent }">
						<input type="submit" name="Submit" value="提交">
						<input type="checkbox" name="history" value="yes"
							<c:if test="${history!=null }"> checked="yes"</c:if>>
						查询历史记录
					</form>
				</td>
			</tr>
		</table>
		
		<table width="90%" border="0" align="center" cellpadding="0"
			cellspacing="0">
			<!--DWLayoutTable-->
			<tr>
				<td width="100%" valign="top">
					<table width="100%" border="1" align="center" cellpadding="0"
						cellspacing="0">
						<!--DWLayoutTable-->
						<tr>
							<td>
								<div align="center">
									教师编号
								</div>
							</td>
							<td>
								<div align="center">
									教师姓名
								</div>
							</td>
							<td>
								<div align="center">
									教师性别
								</div>
							</td>
							<td>
								<div align="center">
									班级名称
								</div>
							</td>
							<td>
								<div align="center">
									年级
								</div>
							</td>
							<td>
								<div align="center">
									班级专业
								</div>
							</td>
							<td>
								<div align="center">
									任职日期
								</div>
							</td>
							<c:if test="${history==null }">
								<td>
									<div align="center">
										维护
									</div>
								</td>
							</c:if>
							<c:if test="${history!=null }">
								<td>
									<div align="center">
										离职日期
									</div>
								</td>
							</c:if>
						</tr>
						<c:forEach var="acs" items="${list}">
							<tr>
								<td>
									<div align="center">
										${acs.teacherInfo.teiId }
									</div>
								</td>
								<td>
									<div align="center">
										${acs.teacherInfo.teiName }
									</div>
								</td>
								<td>
									<div align="center">
										${acs.teacherInfo.teiSex }
									</div>
								</td>
								<td>
									<div align="center">
										${acs.systemClassInfo.sciName }
									</div>
								</td>
								<td>
									<div align="center">
										${acs.systemClassInfo.systemGradeCode.sgcName }
									</div>
								</td>
								<td>
									<div align="center">
										${acs.systemClassInfo.systemSpecialtyCode.sscName }
									</div>
								</td>
								<td>
									<div align="center">
										${acs.acsRzrq }
									</div>
								</td>
								<c:if test="${history==null }">
									<td class="button_ex" align="middle">
										<div align="center">
											<a href="searchClassLoader?acsId=${acs.acsId }">离职</a>
										</div>
									</td>
								</c:if>
								<c:if test="${history!=null }">
									<td>
										<div align="center">
											${acs.acsLzrq }
										</div>
									</td>
								</c:if>
							</tr>
						</c:forEach>
					</table>
				</td>
			</tr>
		</table>
	</body>
</html>
