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
		<title>网上图书超市</title>
		<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
		<link href="../../res/css/style.css" rel="stylesheet">
	</head>
	<body>
		<table width="90%" border="0" cellpadding="0" cellspacing="0" class="tableBorder_LTR">
			<tr>
				<td height="40" align="center">
					<div align="center">
						<p><span></span></p>
				</div></td>
			</tr>
		</table>
		<table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">
			<tr>
				<td width="100%" height="49" align="center">
					<form name="myform" method="post" action="searchBook">请输入查询条件：
						<select name="condition" id="condition" tabindex="2">
							<option selected="true">书号</option>
							<option>书名</option>
							<option>出版社</option>
						</select>
						<input name="conditionContent" type="text" id="conditionContent">
						<input type="submit" name="Submit" value="提交">
					</form>
				</td>
			</tr>
		</table>
		<table width="90%" border="0" align="center" cellpadding="0" cellspacing="0">
			<tr>
				<td width="100%" height="362" valign="top">
					<table width="100%" border="1" align="center" cellpadding="0" cellspacing="0">
						<tr>
							<td><div align="center">书号</div></td>
							<td><div align="center">书名</div></td>
							<td><div align="center">出版社</div></td>
							<td><div align="center">单价</div></td>
							<td><div align="center">库存数量</div></td>
							<td><div align="center">维护</div></td>
						</tr>
						<c:forEach var="bki" items="${result}">
						<tr>
							<td><div align="center">${bki.bkiId }&nbsp;</div></td>
							<td><div align="center">${bki.bkiName }&nbsp;</div></td>
							<td><div align="center">${bki.bkiConcern }&nbsp;</div></td>
							<td><div align="center">${bki.bkiPrice }&nbsp;</div></td>
							<td><div align="center">${bki.bkiCount }&nbsp;</div></td>
							<td class="button_ex" align="middle">
								<div align="center">
									<a href="detailBook?bkiId='${bki.bkiId }'" target="mainFrame">更改</a>
								</div>
							</td>
						</tr>
						</c:forEach>
					</table>
				</td>
			</tr>
		</table>
	</body>
</html>
