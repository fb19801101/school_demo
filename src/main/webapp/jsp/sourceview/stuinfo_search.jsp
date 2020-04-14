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
		<title>成绩查询</title>
		<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
		<link href="../../res/css/style.css" rel="stylesheet">
	</head>
	<body>
		<table width="80%" border="0" cellpadding="0" cellspacing="0"
			class="tableBorder_LTR">
			<tr>
				<td height="40" align="center">
					&nbsp;
				</td>
			</tr>
		</table>
		<table width="95%" border="0" align="center" cellpadding="0"
			cellspacing="0">
			<tr>
				<td width="80%" height="49" align="center">
					<form name="form1" method="post" action="searchExamInfo">
						请输入查询条件：
						<select name="condition" id="condition" tabindex="2">
							<option selected="true" value="csi_exam_type">
								考试类别
							</option>
							<option value="scc_code">
								科目名称
							</option>
							<option value="sti_id">
								学生编号
							</option>
							<option value="sti_id">
								学生姓名
							</option>
						</select>
						<input name="conditionContent" type="text" id="conditionContent">
						<input type="submit" name="Submit" value="提交">
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
									考试类别</div>
							</td>
							<td>
								<div align="center">
									科目名称</div>
							</td>
							<td>
								<div align="center">
									学生编号</div>
							</td>
							<td>
								<div align="center">
									学生姓名</div>
							</td>
							<td>
								<div align="center">
									成绩</div>
							</td>
						</tr>
						<c:forEach var="csi" items="${list}">
							<tr>
								<td>
									<div align="center">
										${csi.csiExamType }&nbsp;
									</div>
								</td>
								<td>
									<div align="center">
										${csi.systemCourseCode.sccName }&nbsp;
									</div>
								</td>
								<td>
									<div align="center">
										${csi.studentInfo.stiId }&nbsp;
									</div>
								</td>
								<td>
									<div align="center">
										${csi.studentInfo.stiName }&nbsp;
									</div>
								</td>
								<td>
									<div align="center">
										${csi.csiGrade }&nbsp;
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
