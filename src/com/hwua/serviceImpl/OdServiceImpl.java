package com.hwua.serviceImpl;

import com.hwua.dao.OdDao;
import com.hwua.entity.Od;
import com.hwua.service.OdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class OdServiceImpl implements OdService {

    @Autowired
    OdDao odDao;
    @Override
    public String insert(Od od) {
        int i = odDao.insert(od);
        if(i>0){
            return "添加成功";
        }
        return "订单明细添加失败";
    }

    @Override
    public List<Od> selectUser_id(Integer user_id) {
        return odDao.selectUser_id(user_id);
    }

    @Override
    public String delete(Integer od_ordersid) {
        int i = odDao.delete(od_ordersid);
        if(i>0){
            return "更新成功";
        }
        return "更新失败";
    }
}
