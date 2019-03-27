package com.hwua.controller;

import com.hwua.entity.Od;
import com.hwua.entity.Orders;
import com.hwua.service.CarService;
import com.hwua.service.GoodService;
import com.hwua.service.OdService;
import com.hwua.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/ding")
public class DingController {

    @Autowired
    OrdersService ordersService;
    @Autowired
    OdService odService;
    @Autowired
    GoodService goodService;
    @Autowired
    CarService carService;

    @RequestMapping("/selectSeif")
    public String selectSeif(){
        return "forward:/WEB-INF/view/self_info.jsp";
    }

    @RequestMapping("/atate")
    public String atate(String order_atate,String order_id,HttpServletRequest req){
        String order_atate1 = req.getParameter("order_atate");
        String order_id1 = req.getParameter("order_id");
        int atate1 = Integer.parseInt(order_atate1);
        int id1 = Integer.parseInt(order_id1);
        String update = ordersService.update(id1, atate1);
        if(update.equals("更新成功")){
            return "forward:/ding/select";
        }
        return update;
    }

    @RequestMapping("/delete")
    public String delete(String order_id,HttpServletRequest req){
        String order_id1 = req.getParameter("order_id");
        int id1 = Integer.parseInt(order_id1);
        String delete = ordersService.delete(id1);
        String delete1 = odService.delete(id1);
        if(delete.equals("更新成功") && delete1.equals("更新成功")){
            return "forward:/ding/select";
        }
        return "forward:/ding/select";
    }

    @RequestMapping("/select")
    public String select(HttpSession session, HttpServletRequest req){
        String user_username = (String)session.getAttribute("user_username");
        if(user_username == null){
            return "login";
        }
        int user_id = (int)session.getAttribute("user_id");
        List<Orders> orders = ordersService.selectUser_id(user_id);
        req.setAttribute("orders",orders);
        return "forward:/WEB-INF/view/dingdanzhongxin.jsp";
    }



    @RequestMapping(value = "/insert",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String insert(int as_id,int total,int[] goodids,int[] car_carid,int[] counts,double[] prices,
                         HttpSession session){
        //获取订单编号
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String format = simpleDateFormat.format(date);
        int a = (int)(Math.random()*100000);
        String bianma =format+a;

        //*往订单表添加数据
        int user_id = (int)session.getAttribute("user_id");
        Orders orders = new Orders(null,user_id,bianma,null,1,total,as_id);
        String insertOrders = ordersService.insert(orders);//订单表
        String insertOd = null;
        String goodPanDuan = null;
        String carPanDuan = null;

        //往订单明细表添加数据
        for (int i=0;i<goodids.length;i++){
            int goodid = goodids[i];
            int count = counts[i];
            double price = prices[i];
            int carid = car_carid[i];
            Od od = new Od(null,user_id,orders.getOrder_id(),goodid,price,count);
            insertOd = odService.insert(od);//订单详情
            goodPanDuan = goodService.update(count, goodid);//更新商品数量
            carPanDuan = carService.deteleCar_carid(carid);//删除购物车
        }
        if(insertOd.equals("添加成功") && insertOrders.equals("添加成功") && goodPanDuan.equals("添加成功") && carPanDuan.equals("删除成功")){
            return "订单添加成功";
        }
        if(!insertOd.equals("添加成功")){
            return "1订单明细表添加失败";
        }
        if(!insertOrders.equals("添加成功")){
            return "2订单表添加失败";
        }
        return "3订单添加失败";
    }
}
