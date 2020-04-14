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
<script language="javascript">
	function deal(){
		if(confirm("是否进行学生信息数据存盘操作？")){
			myform.submit();
			//window.history(-1);		
		}
	}
</script>
<html>
<link href="../../res/css/style.css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<head>
	<title>学生基本信息登录情况</title>
</head>
<body>
	<tr>
		<td height="44" colspan="6">

		</td>
	</tr>

	<form method="POST" action="insertStudentInfo" name="myform">
		<table width="600" height="266" border="0" align="center" cellpadding="0" cellspacing="0">
				<tr>
					<td width="94" ><font color="red">学生编号</font></td>
					<td width="188">
						<input type="text" name="stuId" value="${messages.stiId}" width="188" readonly="readonly"></td>
					<td width="96">学生姓名</td>
					<td width="196">
						<input type="text" name="name"width="188" value="${messages.stiName}"></td>
				</tr>
				<tr>
					<td>学生性别</td>
					<td>
						<input name="sex" type="radio" value="男" <c:if test="${messages.stiSex=='男'}"> checked="yes"</c:if>>男
						<input name="sex" type="radio" value="女" <c:if test="${messages.stiSex=='女'}"> checked="yes"</c:if>>女
					</td>
					<td>学生年龄</td>
					<td>
						<input type="text" name="age" width="188" value="${messages.stiAge}"></td>
				</tr>
				<tr>
					<td>身份证号</td>
					<td>
						<input type="text" name="sfzhm" width="188" value="${messages.stiSfzh}"></td>
					<td>出生日期</td>
					<td>
						<input type="text" name="csrq" width="188"
									 value="<fmt:formatDate value='${messages.stiCsrq}' pattern='yyyy-MM-dd  HH:mm:ss'/>">
					</td>
				</tr>
				<tr>
					<td>家庭地址</td>
					<td>
						<input type="text" name="jtdz" width="188" value="${messages.stiJtdz}">					</td>
					<td>家庭电话</td>
					<td>
						<input type="text" name="jtdh" width="188" value="${messages.stiJtdh}">					</td>
				</tr>
				<tr>
					<td colspan="3">
						政治面貌
						<select name="zzmm">
						<option value="党员" <c:if test="${messages.stiZzmm=='党员'}"> selected="yes"</c:if>>党员</option>
						<option value="团员" <c:if test="${messages.stiZzmm=='团员'}"> selected="yes"</c:if>>团员</option>
						</select>

						健康状况
						<select name="jkzk">
							<option value="优" <c:if test="${messages.stiJkzk=='优'}"> selected="yes"</c:if>>优</option>
							<option value="良" <c:if test="${messages.stiJkzk=='良'}"> selected="yes"</c:if>>良</option>
						</select>
					</td>
					<td>
						<div align="center">
							<input type="reset" name="add" value="重置" />
							<input type="button" name="save" value="提交" onClick="myform.submit();"/>
						</div>
					</td>
				</tr>
		  </table>
	</form>
	 <div align="center" class="style1" >${msg}</div>
</body>
</html>