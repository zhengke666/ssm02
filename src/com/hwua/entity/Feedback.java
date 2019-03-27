package com.hwua.entity;

public class Feedback {

    private Integer f_id;
    private Integer f_uid;
    private String f_proposal;

    public Feedback() {
    }

    public Feedback(Integer f_id, Integer f_uid, String f_proposal) {
        this.f_id = f_id;
        this.f_uid = f_uid;
        this.f_proposal = f_proposal;
    }

    public Integer getF_id() {
        return f_id;
    }

    public void setF_id(Integer f_id) {
        this.f_id = f_id;
    }

    public Integer getF_uid() {
        return f_uid;
    }

    public void setF_uid(Integer f_uid) {
        this.f_uid = f_uid;
    }

    public String getF_proposal() {
        return f_proposal;
    }

    public void setF_proposal(String f_proposal) {
        this.f_proposal = f_proposal;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "f_id=" + f_id +
                ", f_uid=" + f_uid +
                ", f_proposal='" + f_proposal + '\'' +
                '}';
    }
}
