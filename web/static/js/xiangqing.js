$(document).ready(function () {
    var count = $("#count").val();
    var good_name = $("#good_name").val();
    count = parseInt(count);
    var good_kucun = $("#good_kuncun").text();
    var good_name = $("#good_name").text();


    $("#mins").click(function () {
        if (count>1){
            count = count-1;
            $("#count").val(count)
        }
    });

    $("#max").click(function () {
        if (count<good_kucun){
            count = count + 1;
            $("#count").val(count)
        }
    });

    $("#count").blur(function () {
        count = $(this).val();
        if (count>good_kucun){
            alert("库存不足,请重新选择")
            self.location.href = "/ssm02/good/selectByNameGood?good_name="+good_name;
        }
        if(count == 0){
            alert("数量最低为1")
            self.location.href = "/ssm02/good/selectByNameGood?good_name="+good_name;
        }
        $("#count").val(count)
    });

    //添加购物车
    $("#addCar").click(function () {
        $.ajax({
            url:"/ssm02/car/addCar",
            data:{
                "good_name":good_name,
                "car_count":count
            },
            type:"post",
            dataType:"text",
            success:function (data) {
                if(data =="login"){
                    self.location.href = "/ssm02/jsp/login.jsp";
                }else {
                    alert(data)
                }
            },
            error:function () {
                alert("添加购物车错误")
            }
        });
    });

});

