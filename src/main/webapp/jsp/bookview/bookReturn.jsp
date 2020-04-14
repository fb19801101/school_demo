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
		<title>图书归还</title>
		<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
		<link href="../../res/css/style.css" rel="stylesheet">
		<script language="javascript" src="../../res/js/checkform.js"></script>
	</head>
	<body>
		<table width="90%" border="0" align="center" cellpadding="0" cellspacing="0">
			<tr>
				<td valign="top">
					<table width="100%" border="0" cellspacing="0" cellpadding="0" class="tableBorder_LTR">
						<tr>
							<td height="30" align="center">
								<div align="center">
									<p>
										<span class="word_grey"></span>
									</p>
								</div>
							</td>
						</tr>
					</table>
					<form action="returnBook" method="post" name="myform">
						<table width="84%" border="0" align="center" cellpadding="0" cellspacing="0">
							<tr>
								<td width="14%" height="27">学 号：</td>
								<td height="41">
									<input name="stiId" type="text" id="stiId" value="${info.sti.stuId }"
										onchange="if(stiId.value==''||isNaN(stiId.value))alert('请以数字格式输入学号!');
										else window.location.href='returnBook?stiId='+stiId.value+'&bkiId='+bkiId.value">
								</td>
								<td height="27">学生姓名：</td>
								<td height="27">
									<input name="stiName" type="text" id="stiName" value="${info.sti.stiName }" readonly="yes">
								</td>
							</tr>
							<tr>
								<td width="14%" height="27">书 号：</td>
								<td height="41">
									<input name="bkiId" type="text" id="bkiId" value="${info.bwi.bkiId }"
										onblur="if(bkiId.value=='')alert('请输入书号!');
										else window.location.href='returnBook?stiId='+stiId.value+'&bkiId='+bkiId.value">
								</td>
								<td height="27">
									&nbsp;书 名：
								</td>
								<td height="27">
									<input name="bwiName" type="text" id="bwiName" readonly="yes" value="${info.bwi.bwiName }">
								</td>
							</tr>
							<tr>
								<td height="41">借阅日期：</td>
								<td height="41">
									<input name="bwiBorrowDate" type="text" id="bwiBorrowDate" value="${info.bwi.bwiBorrowDate }" readonly="yes">
								</td>
							</tr>
							<tr>
								<td height="38" colspan="4" align="center">
									<input name="return" type="submit" value="归还" onclick="return checkBorrow(myform)">
									<input name="reset" type="reset" value="重置">
								</td>
							</tr>
						</table>
						<hr>
						<table width="90%" border="1" align="center" cellpadding="0"
							cellspacing="0">
							<tr>
								<td>
									<div align="center">
										学号
									</div>
								</td>
								<td>
									<div align="center">
										姓名
									</div>
								</td>
								<td>
									<div align="center">
										书号
									</div>
								</td>
								<td>
									<div align="center">
										书名
									</div>
								</td>
								<td>
									<div align="center">
										借阅日期
									</div>
								</td>
							</tr>
							<c:forEach var="bwi" items="${info['list']}">
								<tr>
									<td>
										<div align="center">
											${bwi.stiId}
										</div>
									</td>
									<td>
										<div align="center">
											${bwi.studentInfo.stiName }
										</div>
									</td>
									<td>
										<div align="center">
											${bwi.bkiId}
										</div>
									</td>
									<td>
										<div align="center">
											${bwi.bwiName }
										</div>
									</td>
									<td>
										<div align="center">
											${bwi.bwiBorrowDate }
										</div>
									</td>
								</tr>
							</c:forEach>
						</table>
					</form>
				</td>
			</tr>
		</table>
	</body>
</html>
