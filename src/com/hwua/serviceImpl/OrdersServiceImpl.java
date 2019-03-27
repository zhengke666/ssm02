package com.hwua.serviceImpl;

import com.hwua.dao.OrdersDao;
import com.hwua.entity.Orders;
import com.hwua.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    OrdersDao ordersDao;
    @Override
    public String insert(Orders orders) {
        int i = ordersDao.insert(orders);
        if(i>0){
            return "添加成功";
        }
        return "订单添加失败";
    }

    @Override
    public List<Orders> selectUser_id(Integer user_id) {
        return ordersDao.selectUser_id(user_id);
    }

    @Override
    public String update(Integer order_id, Integer order_atate) {
        int i = ordersDao.update(order_id,order_atate);
        if(i>0){
            return "更新成功";
        }
        return "更新失败";
    }

    @Override
    public String delete(Integer order_id) {
        int i = ordersDao.delete(order_id);
        if(i>0){
            return "更新成功";
        }
        return "更新失败";
    }

}
