package com.hwua.dao;

import com.hwua.entity.Car;

import java.util.List;

public interface CarDao {
    public int insertCar(Car car);

    public List<Car> selectByuserid(Integer car_userid);

    public List<Car> selectByGoodName(String good_name);

    public int deteleCar_carid(Integer car_carid);

    public int updateCaridCount(int car_carid,int car_count);

    public int updateGoodNameCount(String good_name,int car_count);

}
