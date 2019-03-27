$(document).ready(function () {
   var user_username;
   var user_password;
   var user_password2;
   var user_phone;
   var rand;
   var judge = false;

    //用户名
   $("#user_username").blur(function () {
       user_username = $(this).val();
       //正则表达式
       var zz1 = /^[a-zA-Z0-9_]{0,10}$/;
       if (user_username == null && user_username == ""){
           alert("请输入用户名")
       }
       if (!zz1.test(user_username)){
           alert(user_username)
           alert("用户名格式输入有误,请输入:字母/数字/_(5-10位)")
       }else {
           $.ajax({
               url:"/ssm02/user/registerJudge",
               data:{
                   "user_username":user_username
               },
               type:"post",
               dataType:"text",
               success:function (data) {
                   if (data !="此用户名可用"){
                       alert(data);
                       judge = true;
                   }

               },
               error:function () {
                   alert("输入用户名,网络异常")
               }

           });

       }

   });

    //密码
    $("#user_password").blur(function () {
        user_password = $(this).val();
        //正则表达式
        var zz1 = /^[a-zA-Z0-9_]{5,10}$/;
        if (user_password == null && user_password == ""){
            alert("请输入用户名")
        }
        if (!zz1.test(user_password)){
            if (judge){
                return;
            }
            alert("11用户名格式输入有误,请输入:字母/数字/_(5-10位)")
        }
    });

    //确认密码
    $("#user_password2").blur(function () {
        user_password2 = $(this).val();
        //正则表达式
        var zz1 = /^[a-zA-Z0-9_]{5,10}$/;
        if (user_password2 == null && user_password2 == ""){
            alert("请输入用户名")
        }
        if (!zz1.test(user_password)){
            alert("用户名格式输入有误,请输入:字母/数字/_(5-10位)")
        }
        if (user_password2 != user_password){
            alert("两次密码输入有误")
        }
    });

    //手机号
    $("#user_phone").blur(function () {
        user_phone = $(this).val();
        //手机号正则表达式
        var zPhone = /^1[34578]\d{9}$/;
        if (user_phone == null && user_phone == ""){
            alert("请输入用户名")
        }
        if (!zPhone.test(user_phone)){
            alert("用户名格式输入有误,请输入:字母/数字/_(5-10位)")
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

    //注册
    $("#register").blur(function () {
        if (user_username==null && user_password==null && user_password2==null &&
            user_phone==null && rand==null){
            alert("请输入:用户名/密码/确定密码/手机号/验证码")
        }
        $.ajax({
            url:"/ssm02/user/register",
            data:{
              "user_username":user_username,
              "user_password":user_password,
              "user_phone":user_phone,
              "rand":rand
            },
            type:"post",
            dataType:"text",
            success:function (data) {
                alert(data+",准备跳转登录页面.....")
                self.location.href = "/ssm02/jsp/login.jsp";
            },
            error:function () {
                alert("注册失败")
            }
        });
    });

});