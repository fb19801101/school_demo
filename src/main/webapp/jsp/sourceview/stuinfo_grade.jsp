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
<html> 
<link href="../../res/css/style.css" rel="stylesheet">
<script src="../../res/js/checkform.js"></script>
  <body>
  <tr>
	 <td height="44" colspan="6">
		&nbsp;
	 </td>
	</tr>
  		<form action="gradeScoreList" name="myform" method="post" onsubmit="return sorucenjtj(myform)">
  			
			<br>
  		    <div align="center">
				<tr>
					<td width="154">年级名称:			
					  <select name="selectGrade">
					   				
					    <c:forEach var="sgc" items="${map['grade']}">
		                	<option value="${sgc.sgcCode}" <c:if test="${sgc.sgcCode == map['oldsgcId']}"> selected = "yes"</c:if>>${sgc.sgcName}</option>
		                </c:forEach> 
				      </select>			      
			      </td>				      
					  <td>考试类别：</td>
					  <input type="text" name="examType" value="${map['examType'] }"/>
					  <td>考试日期：</td>
					  <input type="text" name="examDate" value="${map['examDate'] }"/>
					  <td width="113"><input type="submit" name="query" value="查询"></td>
				</tr>
			</div>
			<br>	
			<center>
			  <strong><font color="#0066CC" size="+1"></font></strong>
			</center>
		</form> 
		<table width="90%" border="1" align="center" cellpadding="0" cellspacing="0">	
			<tr>
	     		<c:forEach var="name" items="${map['tname']}">				
					<td height="28" align="center">
						<div align="center">
						    <c:out value="${name}" />
						</div>
				    </td>
    			</c:forEach>    			
			</tr>
			<c:forEach var = "row" items="${map['cdata']}">	
			 <tr>
			 	<c:forEach var="data" items="${row}" >	
			    <td height="28" align="center">
			    	<div align="center">
			    		<c:out value="${data}"/>
					</div>
			    </td>			    
    		  </c:forEach>			 
			 </tr>   			   		
			</c:forEach>	
		</table>
		<center>${map.message }</center>
	</body>  
</html>
