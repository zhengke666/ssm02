package com.hwua.entity;

public class Car {
    private Integer car_carid;
    private Integer car_userid;
    private Integer car_goodid;
    private Integer car_count;

    private Integer good_id;
    private String good_name;
    private Double good_price;
    private String good_img;
    private String good_detail;
    private Integer good_type;
    private Integer good_type2;
    private Integer good_kucun;


    public Car() {
    }

    public Car(Integer car_carid, Integer car_userid, Integer car_goodid, Integer car_count, Integer good_id, String good_name, Double good_price, String good_img, String good_detail, Integer good_type, Integer good_type2, Integer good_kucun) {
        this.car_carid = car_carid;
        this.car_userid = car_userid;
        this.car_goodid = car_goodid;
        this.car_count = car_count;
        this.good_id = good_id;
        this.good_name = good_name;
        this.good_price = good_price;
        this.good_img = good_img;
        this.good_detail = good_detail;
        this.good_type = good_type;
        this.good_type2 = good_type2;
        this.good_kucun = good_kucun;
    }

    public Integer getCar_carid() {
        return car_carid;
    }

    public void setCar_carid(Integer car_carid) {
        this.car_carid = car_carid;
    }

    public Integer getCar_userid() {
        return car_userid;
    }

    public void setCar_userid(Integer car_userid) {
        this.car_userid = car_userid;
    }

    public Integer getCar_goodid() {
        return car_goodid;
    }

    public void setCar_goodid(Integer car_goodid) {
        this.car_goodid = car_goodid;
    }

    public Integer getCar_count() {
        return car_count;
    }

    public void setCar_count(Integer car_count) {
        this.car_count = car_count;
    }

    public Integer getGood_id() {
        return good_id;
    }

    public void setGood_id(Integer good_id) {
        this.good_id = good_id;
    }

    public String getGood_name() {
        return good_name;
    }

    public void setGood_name(String good_name) {
        this.good_name = good_name;
    }

    public Double getGood_price() {
        return good_price;
    }

    public void setGood_price(Double good_price) {
        this.good_price = good_price;
    }

    public String getGood_img() {
        return good_img;
    }

    public void setGood_img(String good_img) {
        this.good_img = good_img;
    }

    public String getGood_detail() {
        return good_detail;
    }

    public void setGood_detail(String good_detail) {
        this.good_detail = good_detail;
    }

    public Integer getGood_type() {
        return good_type;
    }

    public void setGood_type(Integer good_type) {
        this.good_type = good_type;
    }

    public Integer getGood_type2() {
        return good_type2;
    }

    public void setGood_type2(Integer good_type2) {
        this.good_type2 = good_type2;
    }

    public Integer getGood_kucun() {
        return good_kucun;
    }

    public void setGood_kucun(Integer good_kucun) {
        this.good_kucun = good_kucun;
    }

    @Override
    public String toString() {
        return "Car{" +
                "car_carid=" + car_carid +
                ", car_userid=" + car_userid +
                ", car_goodid=" + car_goodid +
                ", car_count=" + car_count +
                ", good_id=" + good_id +
                ", good_name='" + good_name + '\'' +
                ", good_price=" + good_price +
                ", good_img='" + good_img + '\'' +
                ", good_detail='" + good_detail + '\'' +
                ", good_type=" + good_type +
                ", good_type2=" + good_type2 +
                ", good_kucun=" + good_kucun +
                '}';
    }
}
