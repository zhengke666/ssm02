package com.hwua.dao;

import com.hwua.entity.Orders;

import java.util.List;

public interface OrdersDao {

    public int insert(Orders orders);

    public List<Orders> selectUser_id(Integer user_id);

    public int update(Integer order_id,Integer order_atate);

    public int delete(Integer order_id);
}
