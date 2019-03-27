<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/20
  Time: 21:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="common.jsp"%>
<script type="text/javascript" src="${path}/static/js/jquery-3.1.0.js"></script>
<script type="text/javascript">
    function tijiao(){
        var address =  $("#address").val();
        var shoujihao =  $("#shoujihao").val();
        $.ajax({
            url:"${path}/address/inset",
            data:{
                "as_details":address,
                "as_phone":shoujihao
            },
            type:"post",
            dataType:"text",
            success:function (data) {
                alert(data)
            }
        });
    }
</script>
<html>
<head>
    <title>收货地址</title>
</head>
<body>
    <fieldset>
        <legend>添加地址</legend>
        <figure>
            收货地址: <input id="address" name="address" type="text"><br>
            　手机号: <input id="shoujihao" name="shoujihao" type="text"><br>
            <input id="tijiao"  type="button" value="提交" onclick="tijiao()"><br>
            　　　<a href="/ssm02/jsp/index.jsp">主页</a>
        </figure>
    </fieldset>

</body>
</html>
