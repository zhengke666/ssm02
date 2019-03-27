package com.hwua.entity;

public class Od {
    private Integer od_id;
    private Integer od_userid;
    private Integer od_ordersid;
    private Integer od_goodid;
    private Double od_price;
    private Integer od_count;

    public Od() {
    }

    public Od(Integer od_id, Integer od_userid, Integer od_ordersid, Integer od_goodid, Double od_price, Integer od_count) {
        this.od_id = od_id;
        this.od_userid = od_userid;
        this.od_ordersid = od_ordersid;
        this.od_goodid = od_goodid;
        this.od_price = od_price;
        this.od_count = od_count;
    }

    public Integer getOd_id() {
        return od_id;
    }

    public void setOd_id(Integer od_id) {
        this.od_id = od_id;
    }

    public Integer getOd_userid() {
        return od_userid;
    }

    public void setOd_userid(Integer od_userid) {
        this.od_userid = od_userid;
    }

    public Integer getOd_ordersid() {
        return od_ordersid;
    }

    public void setOd_ordersid(Integer od_ordersid) {
        this.od_ordersid = od_ordersid;
    }

    public Integer getOd_goodid() {
        return od_goodid;
    }

    public void setOd_goodid(Integer od_goodid) {
        this.od_goodid = od_goodid;
    }

    public Double getOd_price() {
        return od_price;
    }

    public void setOd_price(Double od_price) {
        this.od_price = od_price;
    }

    public Integer getOd_count() {
        return od_count;
    }

    public void setOd_count(Integer od_count) {
        this.od_count = od_count;
    }

    @Override
    public String toString() {
        return "Od{" +
                "od_id=" + od_id +
                ", od_userid=" + od_userid +
                ", od_ordersid=" + od_ordersid +
                ", od_goodid=" + od_goodid +
                ", od_price=" + od_price +
                ", od_count=" + od_count +
                '}';
    }
}
