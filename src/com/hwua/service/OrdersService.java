package com.hwua.service;

import com.hwua.entity.Orders;

import java.util.List;

public interface OrdersService {

    public String insert(Orders orders);

    public List<Orders> selectUser_id(Integer user_id);

    public String update(Integer order_id,Integer order_atate);

    public String delete(Integer order_id);


}
