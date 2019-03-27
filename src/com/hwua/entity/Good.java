package com.hwua.entity;

public class Good {
    private Integer good_id;
    private String good_name;
    private Double good_price;
    private String good_img;
    private String good_detail;
    private Integer good_type1;
    private Integer good_type2;
    private Integer good_kucun;

    public Good() {
    }

    public Good(Integer good_id, String good_name, Double good_price, String good_img, String good_detail, Integer good_type1, Integer good_type2, Integer good_kucun) {
        this.good_id = good_id;
        this.good_name = good_name;
        this.good_price = good_price;
        this.good_img = good_img;
        this.good_detail = good_detail;
        this.good_type1 = good_type1;
        this.good_type2 = good_type2;
        this.good_kucun = good_kucun;
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

    public Integer getGood_type1() {
        return good_type1;
    }

    public void setGood_type1(Integer good_type1) {
        this.good_type1 = good_type1;
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
        return "Good{" +
                "good_id=" + good_id +
                ", good_name='" + good_name + '\'' +
                ", good_price=" + good_price +
                ", good_img='" + good_img + '\'' +
                ", good_detail='" + good_detail + '\'' +
                ", good_type1=" + good_type1 +
                ", good_type2=" + good_type2 +
                ", good_kucun=" + good_kucun +
                '}';
    }
}
