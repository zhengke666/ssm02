package com.hwua.serviceImpl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.hwua.dao.GoodDao;
import com.hwua.entity.Good;
import com.hwua.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodServiceImpl implements GoodService {

    @Autowired
    GoodDao goodDao;
    @Override
    public Good selectByNameGood(String good_name) {
        Good good = goodDao.selectByNameGood(good_name);
        return good;
    }

    @Override
    public List<Good> selectAllGoodsForPage(int pageNumber, int pageSize) {
        Page page = PageHelper.startPage(pageNumber,pageSize);
        List<Good> goods = goodDao.selectAllGoodsForPage();
        return goods;
    }

    @Override
    public List<Good> selectAll() {
        List<Good> goods = goodDao.selectAllGoodsForPage();
        return goods;
    }

    @Override
    public Good selectByGood_id(Integer good_id) {
        Good good = goodDao.selectByGood_id(good_id);
        return good;
    }

    @Override
    public String update(Integer count, Integer good_id) {
        System.out.println("数量:"+count+"---- ID:"+good_id);
        int i = goodDao.update(count, good_id);
        if(i>0){
            return "添加成功";
        }
        return "添加失败";
    }
}
