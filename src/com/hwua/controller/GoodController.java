package com.hwua.controller;

import com.alibaba.fastjson.JSON;
import com.hwua.entity.Good;
import com.hwua.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Controller
@RequestMapping("/good")
public class GoodController {

    @Autowired
    GoodService goodService;

    @RequestMapping(value = "/goodName",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String selectByNameGood(){
        Good good = goodService.selectByNameGood("小米小米9");
        String str = JSON.toJSONString(good);
        return str;
    }
    //分页查询
    @RequestMapping(value = "/goodAllGoodsForPage",produces ="text/html;charset=UTF-8")
    @ResponseBody
    public String selectAllGoodsForPage(HttpServletRequest req){

        List<Good> goods = goodService.selectAllGoodsForPage(1, 10);
        String str = JSON.toJSONString(goods);
        return str;
    }

    @RequestMapping(value = "/selectByNameGood")
    public String selectByNameGood1(String  good_name,HttpServletRequest req){
        Good good = goodService.selectByNameGood(good_name);
        req.setAttribute("good",good);
        return "xiangqing";
    }


}
