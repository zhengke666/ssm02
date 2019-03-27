$(document).ready(function () {
    var shuru = $("#shuru").val();

    $("#sousuo").click(function () {
       $.ajax({
           url:"/ssm02/good/goodName",
           data:{
              // "good_name":shuru
           },
           type:"post",
           dataType:"json",
           success:function (data) {
               var $div = $(
                   "<div  class='mingxing fl mb20' style='border:2px solid #fff;width:230px;cursor:pointer;' onmouseout='this.style.border=\"2px solid #fff \"' onmousemove='this.style.border=\"2px solid red\"' >" +
                   "<div class='sub_mingxing'><a href='/ssm02/good/selectByNameGood?good_name="+data[i].good_name +"'><img src='/ssm02/"+data[i].good_img+"'></a></div>"+
                   "<div class='pinpai'><a href='/ssm02/jsp/xiangqing.jsp'>"+data[i].good_name+"</a></div>"+
                   "<div class='jiage'>"+data[i].good_price+"</div>"+
                   "</div>"
               );
               $("#goods").append($div);
           }
       });
    });
});