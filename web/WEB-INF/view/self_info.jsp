<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/15
  Time: 15:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/view/common.jsp"%>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="author" content="order by dede58.com"/>
    <title>小米商城-个人中心</title>
    <link rel="stylesheet" type="text/css" href="${path}/static/css/style.css">
</head>
<body>
<!-- start header -->
<%@ include file="/WEB-INF/view/start_header.jsp"%>
<!--end header -->
<!-- start banner_x -->
<%@ include file="/WEB-INF/view/start_banner_x.jsp"%>

<!-- end banner_x -->
<!-- self_info -->
<div class="grzxbj">
    <div class="selfinfo center">
        <div class="lfnav fl">
            <div class="ddzx">订单中心</div>
            <div class="subddzx">
                <ul>
                    <li><a href="${path}/WEB-INF/view/dingdanzhongxin.jsp" >我的订单</a></li>
                    <li><a href="">意外保</a></li>
                    <li><a href="">团购订单</a></li>
                    <li><a href="">评价晒单</a></li>
                </ul>
            </div>
            <div class="ddzx">个人中心</div>
            <div class="subddzx">
                <ul>
                    <li><a href="${path}/WEB-INF/view/self_info.jsp" style="color:#ff6700;font-weight:bold;">我的个人中心</a></li>
                    <li><a href="">消息通知</a></li>
                    <li><a href="">优惠券</a></li>
                    <li><a href="">收货地址</a></li>
                </ul>
            </div>
        </div>
        <div class="rtcont fr">
            <div class="grzlbt ml40">我的资料</div>
            <div class="subgrzl ml40"><span>昵称</span><span>${sessionScope.user_username}</span><span><a href="">编辑</a></span></div>
            <div class="subgrzl ml40"><span>手机号</span><span>${sessionScope.user_phone}</span><span><a href="">编辑</a></span></div>
            <div class="subgrzl ml40"><span>密码</span><span>*******</span><span><a href="">编辑</a></span></div>
            <div class="subgrzl ml40"><span>个性签名</span><span>回首掏,鬼刀一开看不见,走位,走位,嘿嘿嘿！</span><span><a href="">编辑</a></span></div>
            <div class="subgrzl ml40"><span>我的爱好</span><span>女</span><span><a href="">编辑</a></span></div>
            <div class="subgrzl ml40"><span>收货地址</span><span>山东省济宁市高新区创意大厦</span><span><a href="">编辑</a></span></div>

        </div>
        <div class="clear"></div>
    </div>
</div>
<!-- self_info -->

<%@include file="/WEB-INF/view/end_danpin.jsp"%>
</body>
</html>
