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
<link href="../../res/css/style.css" rel="stylesheet">
<script type="text/javascript" src="../../res/js/checkform.js"></script>
<script language="javascript">
	function opendialog(){
		//var someValue=window.showModalDialog('getAllstuinfo','','dialogWidth:600px;dialogHeight:320px;status:no;help:no;scrolling=no;scrollbars=yes;');
		var idValue = window.location.href = 'selectAllStudentInfo';
      stiId.value=idValue;
	}
	function openurl(id){
    var doc = document.getElementById('stiId');//找到id是ipt的input节点
    var val = doc.value;//获取2222这个值
		//alert(sid);
		window.location.href = "insertStudentInfo?stiId="+stiId.value;
	}
	function deal(){		
		if(confirm("是否进行学生登记信息数据存盘操作？")){
			form1.submit();
		}
	}	
</script>
<html>
  <head>
  <c:if test="${sessionScope.loginUser==null}">
    <script language="javascript">
      alert("您未登录或连线超时，请登录系统");
      window.location.href="toMain";
    </script>
  </c:if>
  </head>
  <body>
    <tr>
      <td height="44" colspan="6">
        &nbsp;
      </td>
    </tr>
    <form method="POST" action="regStudentInfo" name="myform" onsubmit="return sturegvalid(myform)">
      <table width="520" height="50" border="0" align="center" cellpadding="0" cellspacing="0">
        <tr>
          <td>
            <div align="center">学生编号
              <input type="text" name="stiId" id = "stiId" value="${messages.stiId}" onkeypress="if(event.keyCode==13){openurl(stiId.value)}"/>
              <input type="button" name="ok" value="确定" onClick="openurl(stiId.value)"/>
              <input type="submit" name="submit" value="提交" />
            </div>
          </td>
        </tr>
      </table>

      <p align="center">
      <table width="520" height="149" border="0" align="center" cellpadding="0" cellspacing="0">
        <tr>
          <td width="94" height="35">学生姓名</td>
          <input type="hidden" name="stiId" value="${messages.stiId}">
          <td width="188"><input type="text" name="stiName" value="${messages.stiName}" readonly="readonly"></td>
          <td>班级名称</td>
          <td><input name="sciName" type="text" value="${messages.sciName}" readonly="readonly"></td>
        </tr>
        <tr>
          <td height="34">专业名称</td>
          <td><input type="text" name="strZymc" value="${messages.strZymc}" readonly="readonly"></td>
          <td> 入学日期 </td>
          <td>
            <input type="text" name="strDjrq" readonly="readonly"
                   value="<fmt:formatDate value='${messages.strDjrq}' pattern='yyyy-MM-dd  HH:mm:ss'/>">
          </td>
        </tr>
        <tr>
          <td height="30"><font color="red"> 经办人 </font></td>
          <td><input type="text" name="strJbr"></td>
          <td><font color="red"> 入学分数</font> </td>
          <td><input type="text" name="strLqfs"></td>
        </tr>
        <tr>
          <td colspan="4">
            <input type="hidden" name="sciId" value="${messages.sciId}"/>
            <input type="hidden" name="strId" value="${messages.strId}"/>
          </td>
        </tr>
      </table>
      <center><FONT color="red" size="4">${messages.msg}</Font></center>
    </form>
    ${sysMsgInf}
  </body>
</html>