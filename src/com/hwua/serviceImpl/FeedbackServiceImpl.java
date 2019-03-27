package com.hwua.serviceImpl;

import com.hwua.dao.FeedbackDao;
import com.hwua.entity.Feedback;
import com.hwua.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackServiceImpl implements FeedbackService {

    @Autowired
    FeedbackDao feedbackDao;

    @Override
    public String insert(Feedback feedback) {
        int i = feedbackDao.insert(feedback);
        if(i>0){
            return "反馈成功";
        }
        return "反馈失败";
    }

    @Override
    public List<Feedback> select() {
        return feedbackDao.select();
    }
}
