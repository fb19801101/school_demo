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
	<head>
		<title>图书维护</title>
		<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
		<link href="../../res/css/style.css" rel="stylesheet">
		<script language="javascript" src="../../res/js/checkform.js"></script>
	</head>
	<body>
		<table width="90%" border="0" align="center" cellpadding="0" cellspacing="0">
			<tr>
				<td width="777" valign="top">
					<table width="100%" border="0" cellspacing="0" cellpadding="0" class="tableBorder_LTR">
						<tr>
							<td height="30" align="center">
								<div align="center">
									<span class="word_grey"></span>
								</div>
							</td>
						</tr>
					</table>
					<form action="borrowBook" method="post" name="myform">
						<table width="84%" border="0" align="center" cellpadding="-2" cellspacing="-2">
							<tr>
								<td width="14%" height="36">学 号：</td>
								<td height="36">
									<input name="stiId" type="text" id="stiId" value="${info.sti.stiId }"
									onblur="if(stiId.value==''||isNaN(stiId.value)) alert('请以数字格式输入学号!');
									else window.location.href='borrowBook?stiId='+stiId.value+'&bkiId='+bkiId.value">
								</td>
								<td height="36">学生姓名：</td>
								<td height="36">
									<input name="stiName" type="text" id="stiName" readonly="yes" value="${info.sti.stiName }">
								</td>
							</tr>
							<tr>
								<td width="14%" height="36">书 号：</td>
								<td height="27">
									<input name="bkiId" type="text" id="bkiId" value="${info.bki.bkiId }"
									onblur="if(bkiId.value=='') alert('请输入书号!');
									else window.location.href='borrowBook?stiId='+stiId.value+'&bkiId='+bkiId.value">
								</td>
								<td height="36">书 名：</td>
								<td height="27">
									<input name="bkiName" type="text" id="bkiName" readonly="yes" value="${info.bki.bkiName }">
								</td>
							</tr>
							<tr>
								<td height="36">作 者：</td>
								<td height="27">
									<input name="bkiWriter" type="text" id="bkiWriter" readonly="yes" value="${info.bki.bkiWriter }">
								</td>
								<td width="15%" height="36">类别名称：</td>
								<td width="38%" height="27">
									<input name="bkiType" type="text" id="bkiType" readonly="yes" value="${info.bki.bkiType }">
								</td>
							</tr>
							<tr>
								<td height="36">操 作 员：</td>
								<td height="27">
									<input name="bkiCzy" type="text" id="bkiCzy" value="${info.bki.bkiCzy }" readonly="yes">
								</td>
								<td height="36">单 价：</td>
								<td height="27">
								   <input name="bkiPrice" type="text" id="bkiPrice" readonly="yes" value="${info.bki.bkiPrice }">(元)
								</td>
							</tr>
							<tr>
								<td height="103">图书简介：</td>
								<td colspan="3">
									<span class="style5"></span>
									<textarea name="bkiRemark" cols="65" rows="5" id="bkiRemark" readonly="yes">${info.bki.bkiRemark}</textarea>
								</td>
							</tr>
							<tr>
								<td height="38" colspan="4" align="center">
									<input name="save" type="submit" value="保存" onclick="return checkBorrow(myform)">
									<input name="reset" type="reset" value="重置">
								</td>
							</tr>
						</table>
					</form>
				</td>
			</tr>
			<table width="90%" border="1" align="center" cellpadding="0" cellspacing="0">
				<tr>
					<td><div align="center">学号</div></td>
					<td><div align="center">姓名</div></td>
					<td><div align="center">书号</div></td>
					<td><div align="center">书名</div></td>
					<td><div align="center">借阅日期</div></td>
				</tr>
			 	<c:forEach var="bwi" items="${info['bwi']}">
				<tr>
					<td><div align="center">${bwi.stiId }</div></td>
					<td><div align="center">${bwi.studentInfo.stiName }</div></td>
					<td><div align="center">${bwi.bkiId }</div></td>
					<td><div align="center">${bwi.bwiName }</div></td>
					<td><div align="center">${bwi.bwiBorrowDate }</div></td>
				</tr>
			 	</c:forEach>
			</table>
		</table>
	</body>
</html>
