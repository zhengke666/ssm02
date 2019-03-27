package com.hwua.controller;

import com.hwua.entity.Feedback;
import com.hwua.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/feedback")
public class FeedbackController {

    @Autowired
    FeedbackService feedbackService;

    @RequestMapping(value = "/insert",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String insert(String proposal, HttpSession session) {
        int user_id = (int)session.getAttribute("user_id");
        Feedback feedback = new Feedback(null,user_id,proposal);
        return feedbackService.insert(feedback);
    }

    @RequestMapping("/select")
    public String select(HttpServletRequest req){
        List<Feedback> list = feedbackService.select();
        req.setAttribute("feedback",list);
        return "forward:/WEB-INF/view/feedback1.jsp";
    }
}
