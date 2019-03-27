package com.hwua.dao;

import com.hwua.entity.Od;

import java.util.List;

public interface OdDao {

    public int insert(Od od);

    public List<Od> selectUser_id(Integer user_id);

    public int delete(Integer od_ordersid);

}
