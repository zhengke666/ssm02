$(document).ready(function () {
    $("#checkall").click(function () {
        var checked = $("#checkall").is(":checked");
        if (checked) {
            $(".item").each(function () {
                $(this).prop("checked", true);
            })
        } else {
            $(".item").each(function () {
                $(this).prop("checked", false);
            })
        }
        jishuan();

    });
    $(".item").each(function () {
        $(this).click(function () {
            var total =  $(".item").length;
            var checked = $(".item:checked").length;
            if(total == checked){
                $("#checkall").prop("checked",true);
            }else {
                $("#checkall").prop("checked",false);
            }
            jishuan();
        });
    });

    //购物车商品数量,和选中数量
    $("#shuliang").html($(".item").length);
    // var checked = $(".item:checked").length;
    // $("#shuliang2").html(checked);

    $(".dizhiquanxuan").each(function () {
        $(this).click(function () {
            var total =  $(".dizhiquanxuan").length;
            var checked = $(".dizhiquanxuan:checked").length;
            if (total != checked+1){
                $(".dizhiquanxuan").prop("checked",false);
            }
        })
    });

    function jishuan() {
        var total = 0;
        $(".item:checked").each(function () {
            var xiaoji = parseFloat($(this).parent().parent().find("#good_price").text());
            total = total + xiaoji;
            $("#total").html(total);
        });
    }

    //添加购物车物品数量
    $(".max").each(function () {
      $(this).click(function () {
          var count = parseInt($(this).prev().val());
          var good_kucun = $("#good_kucun").text();
          if (count<good_kucun) {
              count = count+1;
          }
          $(this).prev().val(count);
          var good_price = parseFloat($(this).parent().parent().find("[title=price]").html());
          var xiaoji = count*good_price;
          $(this).parent().parent().find("[title=good_price]").html(xiaoji)
          var car_carid = $(this).parent().parent().find("[title=car_carid]").html();
          $.ajax({
              url:"/ssm02/car/updateCaridCount",//更新的购物车中的count
              data:{
                  "car_carid":car_carid,
                  "car_count":count
              },
              type:"post",
              dataType:"html",
              success:function (data) {
                  jishuan();
              }
          });
      })
    });

    //减少购物车物品数量
    $(".mins").each(function () {
        $(this).click(function () {
            var count = parseInt($(this).next().val());
            if (count>1) {
                count = count-1;
            }
            $(this).next().val(count);
            var good_price = parseFloat($(this).parent().parent().find("[title=price]").html());
            var xiaoji = count*good_price;
            $(this).parent().parent().find("[title=good_price]").html(xiaoji);
            var car_carid = $(this).parent().parent().find("[title=car_carid]").html();
            $.ajax({
                url:"/ssm02/car/updateCaridCount",//更新的购物车中的count
                data:{
                    "car_carid":car_carid,
                    "car_count":count
                },
                type:"post",
                dataType:"html",
                success:function (data) {
                    jishuan();
                }
            });
        })
    });

    $(".del").each(function () {
        $(this).click(function () {
            var car_carid = $(this).parent().parent().find("[title=car_carid]").html();
            $.ajax({
                url:"/ssm02/car/deteleCar_carid",
                data:{
                    "car_carid":car_carid
                },
                type:"post",
                dataType:"text",
                success:function (data) {
                    alert(data)
                    if (data == "删除成功"){
                        self.location.href = "/ssm02/car/selectByCar_userid";
                    }
                },
            });
        });
    });

    $("#jsan").click(function () {
        var checked = $(".dizhiquanxuan").is(":checked");
        var checked2 =  $(".item:checked").length;
        if (!checked) {
            alert("请先选择地址");
            return;
        }
        if (checked2 == 0){
            alert("请选择商品")
            return;
        }

        var as_id;
        if (checked) {
            as_id = parseInt($("#as_id").html());
        }
        var goodids = [];
        var counts = [];
        var prices = [];
        var car_carid = [];
        $(".item").each(function () {
            var price = $(this).parent().parent().find("div[title=price]").html();
            var goodid = $(this).parent().parent().find("[title=goodid]").html();
            var carid = $(this).parent().parent().find("[title=car_carid]").html();
            var count = $(this).parent().parent().find("[title=count]").val();
            goodids.push(parseInt(goodid));
            counts.push(parseInt(count));
            prices.push(parseFloat(price));
            car_carid.push(parseInt(carid));

        });
        var total = parseInt($("#total").html());
        console.log(goodids);
        console.log(counts);
        console.log(prices);
        console.log(car_carid);
        console.log(total);

        $.ajax({
            url:"/ssm02/ding/insert",
            data:{
                "as_id":as_id,
                "total":total,
                "goodids":goodids,
                "counts":counts,
                "prices":prices,
                "car_carid":car_carid
            },
            traditional:true,
            type:"post",
            dataType:"text",
            success:function (data) {
                alert(data);
                self.location.href = "/ssm02/car/selectByCar_userid";
            }
        });

    });
});
