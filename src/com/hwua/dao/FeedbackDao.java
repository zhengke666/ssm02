package com.hwua.dao;

import com.hwua.entity.Feedback;

import java.util.List;

public interface FeedbackDao {

    public int insert(Feedback feedback);

    public List<Feedback> select();
}
