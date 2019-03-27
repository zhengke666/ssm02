package com.hwua.service;

import com.hwua.entity.Od;

import java.util.List;

public interface OdService {

    public String insert(Od od);

    public List<Od> selectUser_id(Integer user_id);

    public String delete(Integer od_ordersid);

}
