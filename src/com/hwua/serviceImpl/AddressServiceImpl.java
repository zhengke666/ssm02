package com.hwua.serviceImpl;

import com.hwua.dao.AddressDao;
import com.hwua.entity.Address;
import com.hwua.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    AddressDao addressDao;


    @Override
    public String insert(Address address) {
        int insert = addressDao.insert(address);
        if(insert>0){
            return "添加地址成功";
        }
        return "添加地址失败";
    }

    @Override
    public List<Address> select(int as_userid) {
        return addressDao.select(as_userid);
    }
}
