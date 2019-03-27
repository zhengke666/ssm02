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
    <title>小米6立即购买-小米商城</title>
    <link rel="stylesheet" type="text/css" href="${path}/static/css/style.css">
    <script type="text/javascript" src="${path}/static/js/jquery-3.1.0.js"></script>
    <script type="text/javascript" src="${path}/static/js/xiangqing.js"></script>
</head>
<body>
<!-- start header -->
<%@ include file="/WEB-INF/view/start_header.jsp"%>
<!--end header -->

<!-- start banner_x -->
<%@ include file="/WEB-INF/view/start_banner_x.jsp"%>
<!-- end banner_x -->


<!-- xiangqing -->
<form action="post" method="">
    <div class="xiangqing">
        <div class="neirong w">
            <div class="xiaomi6 fl">${good.good_name}</div>
            <nav class="fr">
                <li><a href="">概述</a></li>
                <li>|</li>
                <li><a href="">变焦双摄</a></li>
                <li>|</li>
                <li><a href="">设计</a></li>
                <li>|</li>
                <li><a href="">参数</a></li>
                <li>|</li>
                <li><a href="">F码通道</a></li>
                <li>|</li>
                <li><a href="">用户评价</a></li>
                <div class="clear"></div>
            </nav>
            <div class="clear"></div>
        </div>
    </div>

    <div class="jieshao mt20 w">
        <div class="left fl"><img src="${path}${good.good_img}" width="560px" height="560px"></div>
        <div class="right fr">
            <div class="h3 ml20 mt20"><span id="good_name">${good.good_name}</span></div>
            <div class="jianjie mr40 ml20 mt10">${good.good_detail}</div>
            <div class="jiage ml20 mt10">${good.good_price}元</div>
            <div class="ft20 ml20 mt20"></div>
            <div class="xzbb ml20 mt10">
                <div class="banben fl">
                    <a>
                        <span>小米产品你值得拥有 </span>
                        <span></span>
                    </a>
                </div>
                <span id="good_kuncun" style="display: none">${good.good_kucun}</span>
                <div class="clear"></div>
            </div>
            <div class="ft20 ml20 mt20"></div>
            <div class="xzbb ml20 mt10">
                <div class="banben">
                    <a>
                        <span class="yanse"></span>
                    </a>
                </div>

            </div>
            <div class="xqxq mt20 ml20">
                <div class="top1 mt10">
                    <div class="left1 fl"></div>

                    <div class="right1 fr">
                        购买数量:
                        <input id="mins" type="button" class="mins" value="-">
                        <input id="count" type="text" class="count" value="1" style="width: 20px">
                        <input id="max" type="button" class="max" value="+">
                    </div>

                    <div class="clear"></div>
                </div>
                <div class="bot mt20 ft20 ftbc">单价：${good.good_price}元</div>
            </div>
            <div class="xiadan ml20 mt20">
                <input class="jrgwc"  type="button" name="jrgwc" value="立即选购" />
                <input id="addCar" class="jrgwc" type="button" name="jrgwc" value="加入购物车"/>

            </div>
        </div>
        <div class="clear"></div>
    </div>
</form>
<!-- footer -->
<%@include file="/WEB-INF/view/end_danpin.jsp"%>

</body>
</html>
