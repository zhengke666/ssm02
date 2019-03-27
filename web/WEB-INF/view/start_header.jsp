<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/15
  Time: 14:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="common.jsp"%>
<script type="text/javascript">
    function logout(){
        window.location.href="${path}/jsp/login.jsp"
    }

</script>
<header>
    <div class="top center">
        <div class="left fl">
            <ul>
                <li><a href="http://www.mi.com/" target="_blank">小米商城</a></li>
                <li>|</li>
                <li><a href="">MIUI</a></li>
                <li>|</li>
                <li><a href="">米聊</a></li>
                <li>|</li>
                <li><a href="">游戏</a></li>
                <li>|</li>
                <li><a href="">多看阅读</a></li>
                <li>|</li>
                <li><a href="">云服务</a></li>
                <li>|</li>
                <li><a href="">金融</a></li>
                <li>|</li>
                <li><a href="">小米商城移动版</a></li>
                <li>|</li>

                <c:if test="${sessionScope.user_username=='admin'}">
                <li><a href="${path}/feedback/select">问题反馈</a></li>
                </c:if>
                <c:if test="${sessionScope.user_username!='admin'}">
                    <li><a href="${path}/jsp/feedback.jsp">问题反馈</a></li>
                </c:if>
                <li>|</li>
                <li><a href="">Select Region</a></li>
                <div class="clear"></div>
            </ul>
        </div>
        <div class="right fr">
            <div class="gouwuche fr"><a href="${path}/car/selectByCar_userid">购物车</a></div>
            <div class="fr">
                <ul>
                    <c:if test="${sessionScope.user_username==null}">
                        <li><a href="${path}/jsp/login.jsp" target="_blank">登录</a></li>
                        <li>|</li>
                        <li><a href="${path}/jsp/register.jsp" target="_blank" >注册</a></li>
                        <li>|</li>
                    </c:if>&nbsp;&nbsp;&nbsp;
                    <c:if test="${sessionScope.user_username!=null}">
                        <li>欢迎您，${sessionScope.user_username}&nbsp;&nbsp;&nbsp;</li>
                        <li><a href="javascript:void(0)" onclick="logout()">退出登录</a></li>
                    </c:if>&nbsp;&nbsp;&nbsp;
                        <li><a href="">消息通知</a></li>
                    <li><a href="${path}/ding/select">我的订单</a></li>
                </ul>
            </div>
            <div class="clear"></div>
        </div>
        <div class="clear"></div>
    </div>
</header>
