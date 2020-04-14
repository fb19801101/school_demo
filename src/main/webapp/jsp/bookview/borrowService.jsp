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
		<script language="javascript" src="../../res/js/checkform.js"></script>
	</head>
	<body>
		<p>
		</p>
		<p align="center">
		<span></span>
		</p>
		<table width="90%" border="0" align="center" cellpadding="0" cellspacing="0">
			<tr>
				<td width="100%" height="49" align="center">
					<form name="myform" method="post" action="searchBorrow" onsubmit="return checkBorrowService(myform)">
						请输入查询条件：
						<select name="condition" id="condition" tabindex="2">
							<option selected="true">
								学号
							</option>
							<option>
								书号
							</option>
							<option value="借阅日期">
								借阅日期
							</option>
						</select>
						<input name="conditionContent" type="text" id="conditionContent">
						<input name="Submit" type="submit" class="button" value="提交">
						<input name="ShowAll" type="submit" id="showAll" value="全部显示">
					</form>
				</td>
			</tr>
		</table>
		<table width="90%" border="0" align="center" cellpadding="0" cellspacing="0">
			<tr>
				<td width="100%" valign="top">
					<table width="100%" border="1" align="center" cellpadding="0" cellspacing="0">
						<tr>
							<td>
								<div align="center">
									学号
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
									单价
								</div>
							</td>
							<td>
								<div align="center">
									借阅日期
								</div>
							</td>
							<td>
								<div align="center">
									操作员
								</div>
							</td>
						</tr>
						<c:forEach var="bwi" items="${list}">
							<tr>
								<td>
									<div align="center">
										${bwi.stiId }&nbsp;
									</div>
								</td>
								<td>
									<div align="center">
										${bwi.bkiId }&nbsp;
									</div>
								</td>
								<td>
									<div align="center">
										${bwi.bwiName }&nbsp;
									</div>
								</td>
								<td>
									<div align="center">
										${bwi.bwiPrice }&nbsp;
									</div>
								</td>
								<td>
									<div align="center">
										${bwi.bwiBorrowDate }&nbsp;
									</div>
								</td>
								<td>
									<div align="center">
										${bwi.bwiCzy }&nbsp;
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
