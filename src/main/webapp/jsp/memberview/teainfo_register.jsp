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
<script type="text/javascript" src="../../res/js/checkform.js"></script>
<html>
	<head>
		<title>教师基本信息</title>
		<link href="../../res/css/style.css" rel="stylesheet">
	</head>
	<script src="../../res/js/checkform.js">
	</script>
	<body>
		<c:if
			test="${sessionScope.loginUser!=null&&sessionScope.loginUser.username=='admin' }">
			<form name="form1" method="post" action="${pageContext.request.contextPath}/teacher/regTeacherInfo" onsubmit="return checkTea(form1)">
				<table height="400" border="0" align="center" cellpadding="0" cellspacing="0">
					<tr align="center" valign="middle">
						<td height="51" colspan="6">
							&nbsp;
						</td>
					</tr>
					<tr>
						<td width="79">教师姓名</td>
						<td width="193">
							<input name="teiName" type="text" id="name" maxlength="12">
						</td>
						<td width="75">年龄</td>
						<td width="208">
							<input name="teiAge" type="text" id="age">
						</td>
					</tr>
					<tr>
						<td>性别</td>
						<td>
							<table width="110">
								<tr>
									<td>
										<label>
											<input name="teiSex" type="radio" value="男" checked>
											男
											<input name="teiSex" type="radio" value="女">
											女
										</label>
									</td>
								</tr>
							</table>
						</td>
						<td>婚否</td>
						<td>
							<table width="168">
								<tr>
									<td width="160">
										<label>
											<input name="teiHunfou" type="radio" value="no" checked>
											未婚
											<input name="teiHunfou" type="radio" value="yes">
											已婚
										</label>
									</td>
								</tr>
							</table>
						</td>
					</tr>
					<tr>
						<td>政治面貌</td>
						<td>
							<input name="teiZzmm" type="text" id="zzmm" maxlength="20">
						</td>
						<td>民族</td>
						<td>
							<input name="teiMinzu" type="text" id="minzu" maxlength="10">
						</td>
					</tr>
					<tr>
						<td>学历</td>
						<td>
							<input name="teiXueli" type="text" id="xueli">
						</td>
						<td>出生日期</td>
						<td>
							<input name="teiCsrq" type="text" id="csrq">
						</td>
					</tr>
					<tr>
						<td>身份证号</td>
						<td>
							<input name="teiSfzh" type="text" id="sfzh" maxlength="18">
						</td>
						<td>联系电话</td>
						<td>
							<input name="teiLxdh" type="text" id="lxdh" maxlength="15">
						</td>
					</tr>
					<tr>
						<td>工作日期</td>
						<td>
							<input name="teiGzrq" type="text" id="gzrq">
						</td>
						<td>授课专业</td>
						<td>
							<select name="sscCode">
								<c:if test="${ssclist != null}">
									<c:forEach var="ssc" items="${ssclist}">
										<option value="${ssc.sscCode}">
											${ssc.sscName}
										</option>
									</c:forEach>
								</c:if>
							</select>
						</td>
					</tr>
					<tr>
						<td>工作简介</td>
						<td colspan="3">
							<textarea name="teiGzjj" cols="50" rows="5" id="gzjj"></textarea>
						</td>
					</tr>
					<tr>
						<td>

						</td>
						<td>

						</td>
						<td>
							<input type="submit" name="Submit" value="提交">
						</td>
						<td>
							<input type="reset" name="Reset" value="重置">
						</td>
					</tr>
				</table>
			</form>
			<c:if test="${teainfo != null}">
				<CENTER>
					教师：“${teainfo.teiName}”&nbsp;添加成功。
					教师编号为：${teainfo.teiId}
				</CENTER>
			</c:if>
			<c:if test="${alert!=null}">
				<h3 align="center">
					警告：${alert}
				</h3>
			</c:if>
		</c:if>
		<c:if
			test="${sessionScope.loginUser==null||sessionScope.loginUser.username!='admin'}">
			<p>
				&nbsp;
			</p>
			<p>
				&nbsp;
			</p>
			<p>
				&nbsp;
			</p>
			<p>
				&nbsp;
			</p>
			<p align="center">
				您未登录或权限不够，请重新登录系统。
			</p>
		</c:if>
	</body>
</html>
