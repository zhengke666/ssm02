package com.hwua.dao;

import com.hwua.entity.Good;

import java.util.List;


public interface GoodDao {
    //根据商品名查询商品的信息
    public Good selectByNameGood(String good_name);

    //查询全部商品的信息
    public List<Good> selectAllGoodsForPage();

    //根据商品ID查询商品的信息
    public Good selectByGood_id(Integer good_id);

    public int update(Integer count,Integer good_id);

}
