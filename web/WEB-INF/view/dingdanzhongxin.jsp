<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/15
  Time: 15:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
                    <li><a href="" style="color:#ff6700;font-weight:bold;">我的订单</a></li>
                    <li><a href="">意外保</a></li>
                    <li><a href="">团购订单</a></li>
                    <li><a href="">评价晒单</a></li>
                </ul>
            </div>
            <div class="ddzx">个人中心</div>
            <div class="subddzx">
                <ul>
                    <li><a href="${path}/ding/selectSeif">我的个人中心</a></li>
                    <li><a href="">消息通知</a></li>
                    <li><a href="">优惠券</a></li>
                    <li><a href="${path}/address/query">收货地址</a></li>
                </ul>
            </div>
        </div>
        <div class="rtcont fr">
            <div class="ddzxbt">交易订单</div>
            <c:forEach items="${requestScope.orders}" var="orders">
            <div class="ddxq">
                <%--<div class="ddspt fl"><img src="${path}/static/image/gwc_xiaomi6.jpg" alt=""></div>--%>
                <div class="ddbh fl">${orders.order_number}</div>
                <div class="ztxx fr">
                    <ul>
                        <li>
                            <c:if test="${orders.order_atate=='1'}">
                                <a href="${path}/ding/atate?order_atate=2&order_id=${orders.order_id}">去付款</a>
                            </c:if>
                            <c:if test="${orders.order_atate=='2'}">
                                <a href="${path}/ding/atate?order_atate=3&order_id=${orders.order_id}">待收货</a>
                            </c:if>
                            <c:if test="${orders.order_atate=='3'}">
                                <span>完成</span>
                            </c:if>
                        </li>
                        <li>￥${orders.order_total}</li>
                        <li>${orders.order_time}</li>
                        <li><a href="${path}/ding/delete?order_id=${orders.order_id}">删除></a></li>
                        <div class="clear"></div>
                    </ul>
                </div>
                <div class="clear"></div>
            </div>
            </c:forEach>
        </div>
        <div class="clear"></div>
    </div>
</div>
<!-- self_info -->


<%@include file="/WEB-INF/view/end_danpin.jsp"%>
</body>
</html>
