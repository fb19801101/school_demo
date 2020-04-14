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
<html>
<c:if test="${sessionScope.loginUser==null}">
	<script language="javascript">
		alert("您未登录或连线超时，请登录系统");
		window.location.href="toMain";
	</script>  
</c:if>

<script src="../../res/js/checkform.js"></script>
  <link href="../../res/css/style.css" rel="stylesheet">
	<body>
		<tr>
			<td height="44" colspan="6">
			&nbsp;
			</td>
		</tr>
		<form method="POST" action="insertStudentInfo" name="myform" onSubmit="return stuinfovalid(myform)">
			<p align="center"></p>
			<p>&nbsp;</p>
			<table width="600" height="266" border="0" align="center" cellpadding="0" cellspacing="0">
				<tr align="center" valign="middle">
					<td height="51" colspan="4">
						&nbsp;
					</td>
				</tr>
				<tr>
					<td>
						<font color="red">学生班级</font>
					</td>
					<td>
						<select name="sciId" onChange="window.location.href='createMaxStudentInfoId?sciId='+this.value">
							<c:if test="${messages['class'] != null}">
								<c:forEach var="csi" items="${messages['class']}">
									<option value="${csi.sciId}" ${csi.sciId eq messages.sciId?'selected':'' }>${csi.sciName}</option>
								</c:forEach>
							</c:if>
						</select>
					</td>
				</tr>
				<tr>
					<td width="80">学生编号</td>
					<td width="180">
						<input type="text" name="stiId" value="${messages['stiId']}" readonly="readonly"></td>
					<td width="80">学生姓名</td>
					<td width="180">
						<input type="text" name="stiName" value="${messages['stiName']}">
					</td>
				</tr>
				<tr>
					<td>学生性别</td>
					<td>
						<input name="stiSex" type="radio" value="男" checked="yes">男
						<input name="stiSex" type="radio" value="女">女
					</td>
					<td>学生年龄</td>
					<td>
						<input type="text" name="stiAge">
					</td>
				</tr>
				<tr>
					<td>身份证号</td>
					<td>
						<input type="text" name="stiSfzh">
					</td>
					<td>出生日期</td>
					<td>
						<input type="text" name="stiCsrq">
					</td>
				</tr>
				<tr>
					<td>家庭地址</td>
					<td>
						<input type="text" name="stiJtdz">
					</td>
					<td>家庭电话</td>
					<td>
						<input type="text" name="stiJtdh">
					</td>
				</tr>
				<tr>
					<td>政治面貌</td>
					<td>
						<select name="stiZzmm">
							<option value="党员">党员</option>
							<option value="团员">团员</option>
						</select>
					</td>
					<td>健康状况</td>
					<td>
						<select name="stiJkzk">
							<option value="优">优</option>
							<option value="良">良</option>
						</select>
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
		<div align="center"><font color="red" size="4">${messages['msg']}</font></div>
	</body>
</html>
