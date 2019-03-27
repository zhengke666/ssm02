<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/15
  Time: 15:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>--%>
<%@ include file="/WEB-INF/view/common.jsp"%>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="author" content="order by dede58.com"/>
    <title>我的购物车-小米商城</title>
    <link rel="stylesheet" type="text/css" href="${path}/static/css/style.css">
    <script type="text/javascript" src="${path}/static/js/jquery-3.1.0.js"></script>
    <script type="text/javascript" src="${path}/static/js/gouwuche.js"></script>
</head>
<body>
<!-- start header -->
<!--end header -->

<!-- start banner_x -->
<div class="banner_x center">
    <a href="${path}/jsp/index.jsp" target="_blank"><div class="logo fl"></div></a>

    <div class="wdgwc fl ml40">我的购物车</div>
    <div class="wxts fl ml20">温馨提示：产品是否购买成功，以最终下单为准哦，请尽快结算 <span id="zhuijia"></span></div>
    <div class="clear"></div>
</div>
<div class="xiantiao"></div>
<div class="gwcxqbj">
    <div class="gwcxd center">
        <div class="top2 center">
            <div class="sub_top fl">
                <input id="checkall" type="checkbox" value="quanxuan" class="quanxuan" />全选
            </div>
            <div class="sub_top fl">商品名称</div>
            <div class="sub_top fl">单价</div>
            <div class="sub_top fl">数量</div>
            <div class="sub_top fl">小计</div>
            <div class="sub_top fr">操作</div>
            <div class="clear"></div>
        </div>
        <%--遍历购物车--%>
        <c:forEach items="${requestScope.cars}" var="car">
        <div class="content2 center">
            <div class="sub_content fl ">
                <input type="checkbox" class="item" />
            </div>
            <div class="sub_content fl"><img src="${path}${car .good_img}" width="100px" height="100px"></div>
            <div class="sub_content fl ft20">${car.good_name}</div>
            <div title="price" class="sub_content fl">${car.good_price}</div>

            <span id="good_kucun" style="display: none">${car.good_kucun}</span>
            <%--<span title="car_carid" id="car_carid" style="display: none">${car.car_carid}</span>
            <span title="goodid" id="car_goodid" style="display: none">${car.car_goodid}</span>--%>
            <span title="car_carid" style="display: none">${car.car_carid}</span>
            <span title="goodid" style="display: none">${car.car_goodid}</span>

            <div class="sub_content fl">
                <input type="button" class="mins" value="-">
                <input title="count" type="text" class="count" value="${car.car_count}" style="width: 20px">
                <input type="button" class="max" value="+">
            </div>
            <div title="good_price" id="good_price" class="sub_content fl">${car.good_price*car.car_count}</div>
            <div class="sub_content fl">
                <a class="del" href="javascript:void(0)">×</a>
            </div>
            <div class="clear"></div>
        </div>
        </c:forEach>

    </div>
    <div class="jiesuandan mt20 center">
        <div class="tishi fl ml20">
            <ul>
                <li><a href="${path}/jsp/liebiao.jsp">继续购物</a></li>
                <li>|</li>
                <li>共<span id="shuliang"></span>件商品</li><%--，已选择<span id="shuliang2"></span>件--%>
                <div class="clear"></div>
            </ul>
        </div>
        <div class="jiesuan fr">
            <div class="jiesuanjiage fl">合计（不含运费）：<span id="total"></span>元</div>
            <div class="jsanniu fr"><input id="jsan" class="jsan" type="submit" name="jiesuan"  value="去结算"/></div>
            <div class="clear"></div>
        </div>
        <div class="clear"></div>
    </div>
    <br>
    <c:forEach items="${requestScope.Address}" var="address">
　　　　 <input type="checkbox" value="quanxuan" class="dizhiquanxuan" id="xuanzhe"/>
        <span id="as_id" style="display: none">${address.as_id}</span>
        <b>收货地址:</b>
        <span>${address.as_details}　<b>手机号:</b>${address.as_phone}　</span>
        <br>
    </c:forEach>


</div>




<!-- footer -->
<%@include file="/WEB-INF/view/end_danpin.jsp"%>

</body>
</html>
