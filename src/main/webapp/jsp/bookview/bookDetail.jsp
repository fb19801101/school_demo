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
<html>
	<head>
		<title>图书维护</title>
		<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
		<link href="../../res/css/style.css" rel="stylesheet">
	</head>
	<body>
		<table width="777" border="0" align="center" cellpadding="0" cellspacing="0">
			<tr>
				<td valign="top">
					<table width="100%" border="0" cellspacing="0" cellpadding="0" class="tableBorder_LTR">
						<tr>
							<td height="30" align="center">
								<div align="center">
									<span class="word_grey"></span>
								</div>
							</td>
						</tr>
					</table>
					<form action="modifyBook" method="post" name="myform">
						<table width="84%" border="0" align="center" cellpadding="-2" cellspacing="-2">
							<tr>
								<td width="14%" height="27">
									&nbsp;书 号：
								</td>
								<td height="41">
									<input name="bkiId" type="text" id="bkiId" value="${result.bkiId }" readonly="yes">
								</td>
								<td height="27">
									&nbsp;书 名：
								</td>
								<td height="27">
									<input name="bkiName" type="text" id="bkiName" value="${result.bkiName }">
								</td>
							</tr>
							<tr>
								<td height="27">
									&nbsp;作 者：
								</td>
								<td height="41">
									<input name="bkiWriter" type="text" id="bkiWriter" value="${result.bkiWriter }">
								</td>
								<td width="15%" height="27">
									&nbsp;类别名称：
								</td>
								<td width="38%" height="27">
									<input name="bkiType" type="text" id="bkiType"
										value="${result.bkiType }">
								</td>
							</tr>
							<tr>
								<td height="27">
									&nbsp;出&nbsp;版&nbsp;社：
								</td>
								<td height="41">
									<input name="bkiConcern" type="text" id="bkiConcern" value="${result.bkiConcern }">
								</td>
								<td height="27">
									&nbsp;发行日期：
								</td>
								<td height="41">
									<input name="bkiPublishDate" type="text" id="bkiPublishDate" value="${result.bkiPublishDate }">
								</td>
							</tr>
							<tr>
								<td height="41">
									&nbsp;操 作 员：
								</td>
								<td height="41">
									<input name="bkiCzy" type="text" id="bkiCzy" value="${result.bkiCzy }">
								</td>
								<td height="41">
									&nbsp;价 格：
								</td>
								<td height="41">
									<input name="bkiPrice" type="text" id="bkiPrice" value="${result.bkiPrice }">(元)
								</td>
							</tr>
							<tr>
								<td height="41">
									&nbsp;入库数量：
								</td>
								<td height="41">
									<input name="bkiCount" type="text" id="bkiCount" value="${result.bkiCount }">
								</td>
								<td height="41">
									&nbsp;入库时间：
								</td>
								<td height="41">
									<input name="bkiRegisterDate" type="text" id="bkiRegisterDate" value="${result.bkiRegisterDate }" readonly="yes">
								</td>
							</tr>
							<tr>
								<td height="103">
									&nbsp;图书简介：
								</td>
								<td colspan="3">
									<span class="style5">&nbsp; </span>
									<textarea name="bkiRemark" cols="65" rows="5" id="bkiRemark">${result.bkiRemark}</textarea>
								</td>
							</tr>
							<tr>
								<td height="38" colspan="4" align="center">
									<input name="Button" type="submit" value="保存">
									<input name="Submit2" type="reset" value="重置">
								</td>
							</tr>
						</table>
					</form>
				</td>
			</tr>
		</table>
	</body>
</html>
