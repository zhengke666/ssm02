<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/13
  Time: 15:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="/WEB-INF/view/common.jsp"%>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="author" content="order by dede58.com"/>
    <title>会员登录</title>
    <link rel="stylesheet" type="text/css" href="${path}/static/css/login.css">
    <script type="text/javascript" src="${path}/static/js/jquery-3.1.0.js"></script>
    <script type="text/javascript" src="${path}/static/js/login.js"></script>

</head>
<body>
<!-- login -->
<div class="top center">
    <div class="logo center">
        <a href="${path}/jsp/index.jsp" target="_blank"><img src="${path}/static/image/mistore_logo.png" alt=""></a>
    </div>
</div>
<form  method="post"  class="form center">
    <div class="login">
        <div class="login_center">
            <div class="login_top">
                <div class="left fl">会员登录</div>
                <div class="right fr">您还不是我们的会员？<a href="${path}/jsp/register.jsp" target="_self">立即注册</a></div>
                <div class="clear"></div>
                <div class="xian center"></div>
            </div>
            <div class="login_main center">
                <div class="username">用户名:&nbsp;<input id="user_username" class="shurukuang" type="text" name="username" placeholder="请输入你的用户名"/></div>
                <div class="username">密&nbsp;&nbsp;&nbsp;&nbsp;码:&nbsp;<input id="user_password" class="shurukuang" type="password" name="password" placeholder="请输入你的密码"/></div>
                <div class="username">
                    <div class="left fl">验证码:&nbsp;<input id="rand" class="yanzhengma" type="text" name="username" placeholder="请输入验证码"/></div>
                    <div class="right fl"><img src="${path}/authImg"></div>
                    <div class="clear"></div>
                </div>
            </div>
            <div class="login_submit">
                <input id="login" class="submit" type="button" name="submit" value="立即登录" >
            </div>
        </div>
    </div>
</form>
<footer>
    <div class="copyright">简体 | 繁体 | English | 常见问题</div>
    <div class="copyright">小米公司版权所有-京ICP备10046444-<img src="${path}/jsp/image/ghs.png" alt="">京公网安备11010802020134号-京ICP证110507号</div>

</footer>
</body>
</html>
