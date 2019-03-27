package com.hwua.controller;

import com.hwua.entity.Good;
import com.hwua.entity.User;
import com.hwua.service.UserService;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.portlet.ModelAndView;

import javax.servlet.http.HttpSession;

//控制层
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/login",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String login(String user_username, String user_password, String rand, HttpSession session){
        String  rand1 = (String)session.getAttribute("rand");
        System.out.println(rand);
        if(!rand1.equalsIgnoreCase(rand)){
            return "验证码有误";
        }
        String _user_password = DigestUtils.md5Hex(user_password);
        String info = userService.selectUserByUsername(user_username,_user_password);
        //*
        if(info.equals("登录成功")){
            User user = userService.queryByUsername(user_username);
            session.setAttribute("user_username",user.getUser_username());
            session.setAttribute("user_id",user.getUser_id());
            session.setAttribute("user_password",user.getUser_password());
            session.setAttribute("user_phone",user.getUser_phone());
        }

        return info;
    }

    @RequestMapping(value = "/register",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String register(String user_username, String user_password,String user_phone, String rand, HttpSession session){
        String  rand1 = (String)session.getAttribute("rand");
        System.out.println(rand);
        if(!rand1.equalsIgnoreCase(rand)){
            return "验证码有误";
        }
        String _user_password = DigestUtils.md5Hex(user_password);
        User user = new User(null,user_username,_user_password,user_phone);
        String info = userService.insertOneUser(user);
        return info;
    }

    //注册时判断是否由此用户名
    @RequestMapping(value = "/registerJudge",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String registerJudgeName(String user_username){
        String info = userService.registerJudgeName(user_username);
        return info;
    }

}
