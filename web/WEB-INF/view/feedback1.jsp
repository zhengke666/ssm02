<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/26
  Time: 15:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="common.jsp"%>
<html>
<head>
    <title>反馈页面</title>
</head>
<body>
<table width="200px" height="50px" align="center" border="1" cellpadding="0" cellspacing="0" >
    <tr>
        <td>用户</td>
        <td>内容</td>
    </tr>
    <c:forEach items="${requestScope.feedback}" var="feedback">
        <tr>
            <td>${feedback.f_uid}</td>
            <td>${feedback.f_proposal}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
