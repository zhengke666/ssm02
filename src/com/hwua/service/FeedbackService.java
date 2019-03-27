package com.hwua.service;

import com.hwua.entity.Feedback;

import java.util.List;

public interface FeedbackService {

    public String insert(Feedback feedback);

    public List<Feedback> select();
}
