package com.hwua.entity;

public class Address {
    private Integer as_id;
    private Integer as_userid;
    private String as_details;
    private String as_phone;

    public Address() {


    }

    public Address(Integer as_id, Integer as_userid, String as_details, String as_phone) {
        this.as_id = as_id;
        this.as_userid = as_userid;
        this.as_details = as_details;
        this.as_phone = as_phone;
    }


    public Integer getAs_id() {
        return as_id;
    }

    public void setAs_id(Integer as_id) {
        this.as_id = as_id;
    }

    public Integer getAs_userid() {
        return as_userid;
    }

    public void setAs_userid(Integer as_userid) {
        this.as_userid = as_userid;
    }

    public String getAs_details() {
        return as_details;
    }

    public void setAs_details(String as_details) {
        this.as_details = as_details;
    }

    public String getAs_phone() {
        return as_phone;
    }

    public void setAs_phone(String as_phone) {
        this.as_phone = as_phone;
    }

    @Override
    public String toString() {
        return "Address{" +
                "as_id=" + as_id +
                ", as_userid=" + as_userid +
                ", as_details='" + as_details + '\'' +
                ", as_phone='" + as_phone + '\'' +
                '}';
    }
}
