package com.hwua.service;

import com.hwua.entity.Car;

import java.util.List;

public interface CarService {

    public String insertCar(Car car);

    public List<Car> selectByuserid(Integer car_userid);

    public List<Car> selectByGoodName(String good_name);

    public String deteleCar_carid(int car_carid);

    public int updateCaridCount(int car_carid,int car_count);

    public String updateGoodNameCount(String good_name,int car_count);


}
