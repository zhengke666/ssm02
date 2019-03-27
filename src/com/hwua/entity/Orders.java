package com.hwua.entity;


import java.sql.Date;

public class Orders {

    private Integer order_id;
    private Integer order_userid;
    private String order_number;
    private Date order_time;
    private Integer order_atate;
    private Integer order_total;
    private Integer order_asid;

    public Orders() {
    }

    public Orders(Integer order_id, Integer order_userid, String order_number, Date order_time, Integer order_atate, Integer order_total, Integer order_asid) {
        this.order_id = order_id;
        this.order_userid = order_userid;
        this.order_number = order_number;
        this.order_time = order_time;
        this.order_atate = order_atate;
        this.order_total = order_total;
        this.order_asid = order_asid;
    }

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public Integer getOrder_userid() {
        return order_userid;
    }

    public void setOrder_userid(Integer order_userid) {
        this.order_userid = order_userid;
    }

    public String getOrder_number() {
        return order_number;
    }

    public void setOrder_number(String order_number) {
        this.order_number = order_number;
    }

    public Date getOrder_time() {
        return order_time;
    }

    public void setOrder_time(Date order_time) {
        this.order_time = order_time;
    }

    public Integer getOrder_atate() {
        return order_atate;
    }

    public void setOrder_atate(Integer order_atate) {
        this.order_atate = order_atate;
    }

    public Integer getOrder_total() {
        return order_total;
    }

    public void setOrder_total(Integer order_total) {
        this.order_total = order_total;
    }

    public Integer getOrder_asid() {
        return order_asid;
    }

    public void setOrder_asid(Integer order_asid) {
        this.order_asid = order_asid;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "order_id=" + order_id +
                ", order_userid=" + order_userid +
                ", order_number='" + order_number + '\'' +
                ", order_time=" + order_time +
                ", order_atate=" + order_atate +
                ", order_total=" + order_total +
                ", order_asid=" + order_asid +
                '}';
    }
}
