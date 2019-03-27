<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/26
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/view/common.jsp"%>
<script type="text/javascript" src="${path}/static/js/jquery-3.1.0.js"></script>
<script type="text/javascript">
        function tijiao() {
            var proposal =  $("#proposal").val();
            $.ajax({
                url:"${path}/feedback/insert",
                data:{
                    "proposal":proposal
                },
                type:"post",
                dataType:"text",
                success:function (data) {
                    alert(data);
                },
                error:function () {
                    alert("反馈失败")
                }
            });
        }
</script>
<html>
<head>
    <title>反馈页面</title>
</head>
<body>
<fieldset>
    <legend>反馈填写</legend>
    <figure>
        反馈信息: <input id="proposal" name="proposal" type="text"><br>
        <input id="tijiao"  type="button" value="提交" onclick="tijiao()"><br>
        　　　<a href="/ssm02/jsp/index.jsp">主页</a>
    </figure>
</fieldset>

</body>
</html>
