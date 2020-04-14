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
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
    <title>Login Success</title>
</head>

<body>
    <h1>登录成功！</h1><br>
    登录名称：<%=request.getParameter("username")%><br>
    登录密码：<%=request.getParameter("password")%><br>

    <hr>
    <div>
        <h1>查询结果:</h1><br>
        <%--需要建立对应的界面JavaBean，后台传入对象实例--%>
        消息：<input value=${message}><br>
        编号：<input value=${user.id}><br>
        名字：<input value=${user.username}><br>
        密码：<input value=${user.password}><br>

        <hr>
        <h1>ResultJson:</h1><br>
        <span>${resultJson}</span>
    </div>

    <hr>
    <div>
        <h1>DataBase.tb_student:</h1><br>
        <%
            String[] cols = new String[]{"id","user_no","user_name","user_pwd","user_sex","user_birth","user_class","date_create","date_update"};
        %>
        <table bgcolor="#9999dd" border="1" align="center" width="100%">
            <tr>
            <c:forEach items="<%=cols%>" var="col">
                <th>${col}</th>
            </c:forEach>
            </tr>
            <c:forEach items="${students}" var="item">
            <tr>
                <td align="center" width="5%">${item.id}</td>
                <td  align="center" width="9%">${item.userNo}</td>
                <td  align="center" width="10%">${item.userName}</td>
                <td  align="center" width="10%">${item.userPwd}</td>
                <td  align="center" width="10%">${item.userSex}</td>
                <td align="center" width="10%"><fmt:formatDate value="${item.userBirth}" type="date"/></td>
                <td  align="center" width="10%">${item.userClass}</td>
                <td align="right" width="18%"><fmt:formatDate value="${item.dateCreate}" type="both"/></td>
                <td align="right" width="18%"><fmt:formatDate value="${item.dateUpdate}" type="both"/></td>
            </tr>
            </c:forEach>
        </table>
    </div>

    <hr>
    <div>
        <h1>System.out.println:</h1><br>
        <%
            out.println(request.getAttribute("resultJson") + "<br/>");
            Enumeration en = request.getAttributeNames();
            while (en.hasMoreElements())
            {
                out.println(en.nextElement() + "<br/>");
            }
            out.println(response + "<br/>");
        %>
    </div>
</body>
</html>
