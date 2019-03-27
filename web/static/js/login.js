$(document).ready(function () {
    var user_username;
    var user_password;
    var rand;

    //用户名输入框失去焦点事件
    $("#user_username").blur(function () {
        user_username = $(this).val();
        //正则表达式
        var zz1 = /^[a-zA-Z0-9_]{5,10}$/;
        if (user_username == "" && user_username == null){
            alert("用户名不能为空")
        }
        if (!zz1.test(user_username)){
            alert("用户名格式输入有误,请输入:字母/数字/_(5-10位)")
        }
    });

    //密码输入框失去焦点事件
    $("#user_password").blur(function () {
        user_password = $(this).val();
        //正则表达式
        var zz1 = /^[a-zA-Z0-9_]{5,10}$/;
        if (user_password == "" && user_password == null){
            alert("用户密码不能为空")
        }
        if (!zz1.test(user_password)){
            alert("用户密码格式输入有误,请输入:字母/数字/_(5-10位)")
        }
    });

    //验证码输入框失去焦点事件
    $("#rand").blur(function () {
        rand = $(this).val();
        //正则表达式
        if (rand == "" && rand == null){
            alert("验证码不能为空")
        }
    });

    //登录验证
    $("#login").click(function () {
        if (user_username ==null && user_password ==null && rand ==null){
            alert("请输入:用户名/密码/验证码")
        }

       $.ajax({
           url:"/ssm02/user/login",
           data:{
               "user_username":user_username,
               "user_password":user_password,
               "rand":rand
           },
           dataType:"text",
           type:"post",
           success:function (data) {
               alert(data)
               if(data =="登录成功"){
                   self.location.href = "/ssm02/jsp/index.jsp";
               }
           },
           error:function () {
             alert("登录失败")
           }
       })
    });

    function change() {
        //重新获得验证码图片。后面的随机数不可少，这样就不会去缓存中取，而是重新访问服务器，获得新的验证码图片
        document.getElementById("veryCode").src = "../authImg?t=" + Math.random();

    }

})