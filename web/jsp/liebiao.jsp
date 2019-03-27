<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/15
  Time: 14:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/view/common.jsp"%>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="author" content="order by dede58.com"/>
    <title>小米手机列表</title>
    <link rel="stylesheet" type="text/css" href="${path}/static/css/style.css">
    <script type="text/javascript" src="${path}/static/js/jquery-3.1.0.js"></script>
    <script type="text/javascript" src="${path}/static/js/liebiao.js"></script>
</head>
<body>
<!-- start header -->
<%@ include file="/WEB-INF/view/start_header.jsp"%>
<!--end header -->

<!-- start banner_x -->
<%@ include file="/WEB-INF/view/start_banner_x.jsp"%>
<!-- end banner_x -->

<!-- start banner_y -->
<!-- end banner -->

<!-- start danpin -->
<div class="danpin center">
    <div class="biaoti center">小米商品
    </div>
    <div id="goods" class="main center">

        <div class="clear"></div>
    </div>

    <div id="goods2" class="main center mb20">
        <div class="clear"></div>
    </div>

</div>


<%@ include file="/WEB-INF/view/end_danpin.jsp"%>

<!-- end danpin -->


</body>
</html>
