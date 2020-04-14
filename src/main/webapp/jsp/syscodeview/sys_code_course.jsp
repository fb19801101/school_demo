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
<link href="../../res/css/style.css" rel="stylesheet">
<script language="javascript">
	function deal(id,name){
		if(confirm("是否删除" + name + "学科的信息？")){
			window.location.href ='delCode?code=' + id + '&&name=sb';
		}
	}
	function check(){
		if(document.myform.code.value==''||isNaN(document.myform.code.value)){
			alert("学科代码不能为空，请进行输入!!!");
			document.myform.code.focus();
			return false;
		}
		if(document.myform.name.value==''){
			alert("学科名称不允许为空，请进行输入!!!");
			document.myform.name.focus();
			return false;
		}
	}
</script>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">

<title>学生年级代码设置</title>
</head>
<body onload="document.myform.code.focus();">   
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
<form method="POST" action="sysFormCode?objname=SystemCourseCode" name="myform" onsubmit="return check()">
  <table width="299" border="1" align="center" cellpadding="0" cellspacing="0">
	<tr>
	  <td width="94" height="33"><div align="center">学科代码</div></td>
	  <td width="90"><div align="center">
		  <input name="code" type="text" size="26">
	  </div></td>
	</tr>
	<tr>
	  <td height="35"><div align="center">学科名称</div></td>
	  <td><input name="name" type="text" size="26"></td>
	</tr>
	<tr>
		<td colspan="2">
		  <div align="right">
			<input type="reset" name="reset" value="重置" onclick="document.myform.code.focus();">
			<input type="submit" name="Submit" value="提交">
	</div>        </tr>
  </table>
</form>	
	<div align="center"> <font color="BLUE" >------------------学科信息维护-------------------</font></div>
	<br >
	<table width="299" border="1" align="center" ellpadding="0" cellspacing="0" bordercolor="#ffffff" bordercolorlight="#CCCCCC" bordercolordark="#ffffff">
		<tr align="center">
		  <td>学科代码</td>
		  <td>学科名称</td>
		  <td colspan="2">用户操作</td>
		</tr>
		<c:forEach  items="${listObject}" var="scc" >
			<tr>
				<td height="20" align="center">
					${scc.sccCode}
				</td>
				<td height="20" align="center">
						${scc.sccName}
				</td>
				<td width="52" height="18" align="center" class="button_ex">
				  <a class="hand" onclick="myform.code.value='${scc.sccCode}';myform.name.value='${scc.sccName}';document.myform.name.focus();">修改</a>
				</td>
			   <td height="18" align="center" class="button_ex">
				<a class="hand" onclick="window.location.href('delCode?code=${scc.sccCode}&&name=scc')">删除</a>
			   </td>
			</tr>
		</c:forEach>
	</table>
	<p align="center"><font color="red" size="4">${msgError}</font></p> 
</body>
</html>
