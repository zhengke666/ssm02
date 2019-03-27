package com.hwua.service;

import com.hwua.entity.User;

public interface UserService {
    //根据用户名来查询用户
    public String selectUserByUsername(String user_username, String user_password);

    //查询用户信息用
    public User queryByUsername(String user_username);

    //添加新用户
    public String insertOneUser(User user);

    //注册时判断是否由此用户名
    public String registerJudgeName(String user_username);

}
