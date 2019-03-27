package com.hwua.serviceImpl;

import com.hwua.dao.CarDao;
import com.hwua.entity.Car;
import com.hwua.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    CarDao carDao;
    @Override
    public String insertCar(Car car) {
        int i = carDao.insertCar(car);
        if(i>0){
            return "添加成功";
        }
        return "添加失败";
    }

    @Override
    public List<Car> selectByuserid(Integer car_userid) {
        return carDao.selectByuserid(car_userid);
    }

    @Override
    public List<Car> selectByGoodName(String good_name) {
        return carDao.selectByGoodName(good_name);
    }

    @Override
    public String deteleCar_carid(int  car_carid) {
        int i = carDao.deteleCar_carid(car_carid);
        if(i>0){
            return "删除成功";
        }
        return "删除失败";

    }

    @Override
    public int updateCaridCount(int car_carid, int car_count) {
        return carDao.updateCaridCount(car_count, car_carid);
    }

    @Override
    public String updateGoodNameCount(String good_name, int car_count) {
        int i = carDao.updateGoodNameCount(good_name, car_count);
        if(i>0){
            return "购物车已有此商品,更新数量成功";
        }
        return "更新失败";
    }

}
