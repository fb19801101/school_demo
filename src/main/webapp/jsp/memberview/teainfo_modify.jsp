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
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<c:if test="${sessionScope.loginUser==null}">
	<script language="javascript">
		alert("您未登录或连线超时，请登录系统");
		window.location.href="toMain";
	</script>  
</c:if>
<html>
<head>
	<title>修改教师资料</title>
	<link href="../../res/css/style.css" rel="stylesheet">
</head>
<body>
	<c:if
		test="${sessionScope.loginUser!=null&&sessionScope.loginUser.username=='admin' }">
		<form name="form1" method="post" action="regTeacherInfo">
			<table height="450" border="0" align="center" cellpadding="0"
				cellspacing="0">
				<tr align="center" valign="middle">
				<tr>
				 <td height="44" colspan="6">
					&nbsp;
				 </td>
				</tr>
				<tr>
					<td width="79">
						教师姓名
					</td>
					<td width="193">
						<input name="teiName" type="text" id="name" maxlength="12"
							value="${teainfo.teiName}">
					</td>
					<td width="75">
						年龄
					</td>
					<td width="208">
						<input name="teiAge" type="text" id="age" maxlength="2"
							value="${teainfo.teiAge}">
					</td>
				</tr>
				<tr>
					<td>
						性别
					</td>
					<td>
						<table width="110">
							<tr>
								<td>
									<label>
										<input name="teiSex" type="radio" value="男"
											<c:if test="${teainfo.teiSex=='男'}"> checked="yes"</c:if>>
										男
										<input name="teiSex" type="radio" value="女"
											<c:if test="${teainfo.teiSex=='女'}">checked="yes"</c:if>>
										女
									</label>
								</td>
							</tr>
						</table>
					</td>
					<td>
						婚否
					</td>
					<td>
						<table width="168">
							<tr>
								<td width="160">
									<label>
										<input name="teiHunfou" type="radio" value="no"
											<c:if test="${teainfo.teiHunfou=='no'}"> checked="yes"</c:if>>
										未婚
										<input name="teiHunfou" type="radio" value="yes"
											<c:if test="${teainfo.teiHunfou=='yes'}"> checked="yes"</c:if>>
										已婚
									</label>
								</td>
							</tr>
						</table>
					</td>
				</tr>
				<tr>
					<td>
						政治面貌
					</td>
					<td>
						<input name="teiZzmm" type="text" id="zzmm" maxlength="20"
							value="${teainfo.teiZzmm}">
					</td>
					<td>
						民族
					</td>
					<td>
						<input name="teiMinzu" type="text" id="minzu" maxlength="10"
							value="${teainfo.teiMinzu}">
					</td>
				</tr>
				<tr>
					<td>
						学历
					</td>
					<td>
						<input name="teiXueli" type="text" id="xueli" value="${teainfo.teiXueli}">
					</td>
					<td>
						出生日期
					</td>
					<td>
						<spring:eval expression="teainfo.teiCsrq"></spring:eval>
						<input name="teiCsrq" type="text" id="csrq" readonly="yes"
									 value="<fmt:formatDate value='${teainfo.teiCsrq}' pattern='yyyy-MM-dd  HH:mm:ss'/>">
					</td>
				</tr>
				<tr>
					<td>
						身份证号
					</td>
					<td>
						<input name="teiSfzh" type="text" id="sfzh" maxlength="18"
							value="${teainfo.teiSfzh}" readonly="yes">
					</td>
					<td>
						联系电话
					</td>
					<td>
						<input name="teiLxdh" type="text" id="lxdh" maxlength="15"
							value="${teainfo.teiLxdh}">
					</td>
				</tr>
				<tr>
					<td>
						工作日期
					</td>
					<td>
						<input name="teiGzrq" type="text" id="gzrq"
									 value="<spring:eval expression='teainfo.teiGzrq'></spring:eval>">
					</td>
					<td>
						授课专业
					</td>
					<td>
						<select name="sscCode">
							<c:forEach var="ssc" items="${ssclist}">
								<option value="${ssc.sscCode}"
									<c:if test="${ssc.sscCode==info.systemSpecialtyCode.sscCode}"> selected="yes"</c:if>>
									${ssc.sscName}
								</option>
							</c:forEach>
						</select>
					</td>
				</tr>
				<tr>
					<td>
						教师编号：
					</td>
					<td>
						<input name="teiId" type="text" id="id" maxlength="18"
							value="${teainfo.teiId}" readonly="yes">
					</td>
					<td>
					</td>
					<td>
					</td>
				</tr>
				<tr>
					<td>
						工作简介
					</td>
					<td colspan="3">
						<textarea name="teiGzjj" cols="50" rows="5" id="gzjj">${teainfo.teiGzjj}</textarea>
					</td>
				</tr>
				<tr>
					<td>
						&nbsp;

					</td>
					<td>
						&nbsp;

					</td>
					<td>
						<input type="submit" name="Submit" value="修改">
					</td>
					<td>
						<input name="Reset" type="reset" value="重置">
					</td>
				</tr>
			</table>
		</form>
	</c:if>
	<c:if
		test="${sessionScope.loginUser==null||sessionScope.loginUser.username!='mr' }">
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
