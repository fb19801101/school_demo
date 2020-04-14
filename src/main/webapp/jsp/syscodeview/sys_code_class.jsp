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
		if(confirm("是否删除班级名称为" + name + "的信息？")){
			window.location.href ='delCode?code=' + id + '&&name=cl';
		}
	}
	function check(){		
		if(document.myform.selectsp.value==''){
			alert('请选择专业名称！！！');
			document.myform.selectsp.focus();
			return false;			
		}
		if(document.myform.selectgr.value==''){
			alert('请选择年级名称！！！');
			document.myform.selectsp.focus();
			return false;			
		}
		if(document.myform.classname.value==''){
			alert('班级名称不允许为空，请输入！！！');
			document.myform.classname.focus();
			return false;			
		}
	}
</script>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">

</head>

<body>   
<table width="90%" border="0" align="center" cellpadding="0" cellspacing="0">
	<tr>
		<td height="40" align="center">
			<div align="center">
				<p>

				</p>
			</div>
		</td>
	</tr>
</table>
<form method="POST" action="sysFormCode" name="myform" onsubmit="return check();">
	<INPUT type="hidden" name="hiddspcode"/>
	<INPUT type="hidden" name="hiddgrcode"/>
	<table width="470" border="1" align="center" cellpadding="0" cellspacing="0">
	<tr>
	  <td width="75" height="33"><div align="center">专业名称</div></td>
	  <td>
		<select name="selectsp" onchange="document.myform.hiddspcode.value=this.value">
		<OPTION>请选择专业名称</OPTION>
			<c:forEach var="ssc" items="${messages['spec']}">
				<option value="${ssc.sscCode}">${ssc.sscName}</option>
			</c:forEach>
		</select>
	  </td>
	  <td width="75" td height="33"><div align="center">年级名称</div></td>
	  <td width="145">
		<select name="selectgr" onchange="document.myform.hiddgrcode.value=this.value">
			<OPTION>请选择年级名称</OPTION>
			<c:forEach var="sgc" items="${messages['grade']}">
				<option value="${sgc.sgcCode}">${sgc.sgcName}</option>
			</c:forEach>
		</select>
	  </td>
   <tr>
	 <td width="75" height="26"><div align="center">班级名称</div></td>
	  <td width="145"><div align="left">
		<input name="classname" type="text">
	 </div></td>

		<td colspan="2">
		  <div align="right">
		  <input type="reset" name="reset" value="重置">
		  <input type="submit" name="Submit" value="提交">
		  </div></td>
	</tr>
  </table>
</form>
	<div align="center"> <font color="BLUE" >------------------班级信息维护-------------------</font></div>
	<br >
	<table width="450" border="1" align="center" ellpadding="0" cellspacing="0" bordercolor="#ffffff" bordercolorlight="#CCCCCC" bordercolordark="#ffffff">
			<tr>
			  <td width="75"><div align="center">班级代码</div></td>
			  <td width="70"><p align="center">班级名称</p>
		      </td>
			  <td width="80" height="31"><div align="center">年级名称</div></td>
				<td width="90"><div align="center">专业名称</div></td>
				<td width="105"><div align="center">用户操作</div></td>
			</tr>
			<c:forEach  items="${messages['classinfo']}" var="scil" >
				<tr>
				  <td align="center">${scil.sciId}</td>
				  <td align="center">${scil.sciName}</td>
	  			 <td height="20" align="center">${scil.sscName}</td>
    				<td height="20" align="center">${scil.sgcName}</td>
					<td height="18" align="center" class="button_ex">
		               <a class="hand" onclick="window.location.href('delCode?code=${scil.sciId}&&name=sci')">删除</a>
	                </td>												
				</tr>
			</c:forEach>		
   </table>
   <p align="center"><font color="red" size="4">${messages['msgError']}</font></p> 	
</body>
</html>
