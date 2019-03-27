package com.hwua.controller;


import com.hwua.entity.Address;
import com.hwua.entity.Car;
import com.hwua.entity.Good;
import com.hwua.service.AddressService;
import com.hwua.service.CarService;
import com.hwua.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@RequestMapping("car")
@Controller
public class CarController {

    @Autowired
    CarService carService;
    @Autowired
    GoodService goodService;
    @Autowired
    AddressService addressService;

    @RequestMapping(value = "/addCar",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String insertCar(String good_name, Integer car_count, HttpSession session){
        String user_username = (String)session.getAttribute("user_username");
        if(null == user_username){
            return "login";
        }
        //判断购物车有无此商品,如果有进行数量的更新
        List<Car> cars = carService.selectByGoodName(good_name);
        for (Car car:cars) {
            if(car.getGood_name().equals(good_name)){
                String upGoodName = carService.updateGoodNameCount(good_name, car_count);
                return upGoodName;
            }
        }
        Good good = goodService.selectByNameGood(good_name);
        int user_id = (int)session.getAttribute("user_id");
        Car car = new Car(null,user_id,good.getGood_id(),car_count,good.getGood_id(),good.getGood_name(),
                good.getGood_price(),good.getGood_img(),good.getGood_detail(),
                good.getGood_type1(),good.getGood_type2(),good.getGood_kucun());
        System.out.println(car.toString());
        String str = carService.insertCar(car);
        return str;
    }

    @RequestMapping(value = "/selectByCar_userid")
    public String selectByNameGood1(HttpSession session,HttpServletRequest req){
        //判断是否登录
        String user_username = (String)session.getAttribute("user_username");
        if(null == user_username){
            return "login";
        }
        //遍历地址
        int user_id =(int)session.getAttribute("user_id");
        List<Address> list = addressService.select(user_id);
        req.setAttribute("Address",list);

        int car_userid = (int)session.getAttribute("user_id");
        List<Car> cars = carService.selectByuserid(car_userid);
        req.setAttribute("cars",cars);
        return "forward:/WEB-INF/view/gouwuche.jsp";//遇到forward就不走视图解析器了
    }

    @RequestMapping(value = "/deteleCar_carid",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String deteleCar_carid(String car_carid, HttpServletRequest req){
        System.out.println(car_carid+"*********************");
        int car_carid1 = Integer.parseInt(car_carid);
        return carService.deteleCar_carid(car_carid1);
    }

    @RequestMapping(value = "/updateCaridCount",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String updateCaridCount(int car_carid,int car_count){
        int i = carService.updateCaridCount(car_count, car_carid);
        if(i>0){
            System.out.println("更新成功");
            return car_count+"";
        }
        return "更新失败";
    }


}
