<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/14
  Time: 17:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/view/common.jsp"%>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="author" content="order by dede58.com"/>
    <title>用户注册</title>
    <link rel="stylesheet" type="text/css" href="${path}/static/css/login.css">
    <script type="text/javascript" src="${path}/static/js/jquery-3.1.0.js"></script>
    <script type="text/javascript" src="${path}/static/js/register.js"></script>

</head>
<body>
<form  >
    <div class="regist">
        <div class="regist_center">
            <div class="regist_top">
                <div class="left fl">会员注册</div>
                <div class="right fr"><a href="${path}/jsp/index.jsp" target="_self">小米商城</a></div>
                <div class="clear"></div>
                <div class="xian center"></div>
            </div>
            <div class="regist_main center">
                <div class="username">用&nbsp;&nbsp;户&nbsp;&nbsp;名:&nbsp;&nbsp;<input id="user_username" class="shurukuang" type="text" name="username" placeholder="请输入你的用户名"/><span>请不要输入汉字</span></div>
                <div class="username">密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码:&nbsp;&nbsp;<input id="user_password" class="shurukuang" type="password" name="password" placeholder="请输入你的密码"/><span>请输入6位以上字符</span></div>

                <div class="username">确认密码:&nbsp;&nbsp;<input id="user_password2" class="shurukuang" type="password" name="repassword" placeholder="请确认你的密码"/><span>两次密码要输入一致哦</span></div>
                <div class="username">手&nbsp;&nbsp;机&nbsp;&nbsp;号:&nbsp;&nbsp;<input id="user_phone" class="shurukuang" type="text" name="tel" placeholder="请填写正确的手机号"/><span>填写下手机号吧，方便我们联系您！</span></div>
                <div class="username">
                    <div class="left fl">验&nbsp;&nbsp;证&nbsp;&nbsp;码:&nbsp;&nbsp;<input id="rand" class="yanzhengma" type="text" name="username" placeholder="请输入验证码"/></div>
                    <div class="right fl"><img src="${path}/authImg"></div>
                    <div class="clear"></div>
                </div>
            </div>
            <div class="regist_submit">
                <input id="register" class="submit" type="button" name="submit" value="立即注册" >
            </div>

        </div>
    </div>
</form>
</body>
</html>
