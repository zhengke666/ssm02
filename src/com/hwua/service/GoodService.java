package com.hwua.service;

import com.hwua.entity.Good;

import java.util.List;

public interface GoodService {

    //根据用户名查询商品的信息
    public Good selectByNameGood(String good_name);

    //分页查询
    public List<Good> selectAllGoodsForPage(int pageNumber,int pageSize);

    public List<Good> selectAll();

    //根据商品ID查询商品的信息
    public Good selectByGood_id(Integer good_id);

    public String update(Integer count,Integer good_id);

}
