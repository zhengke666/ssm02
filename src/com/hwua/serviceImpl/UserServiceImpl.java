package com.hwua.serviceImpl;

import com.hwua.dao.UserDao;
import com.hwua.entity.User;
import com.hwua.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;
    @Override
    public String selectUserByUsername(String user_username, String user_password) {
        User user = userDao.selectUserByUsername(user_username);
        if (user == null){
            return "用户名不存在";
        }else if(user.getUser_password().equals(user_password)){
            return "登录成功";
        }else{
            return "密码错误";
        }
    }

    @Override
    public User queryByUsername(String user_username) {
        return userDao.selectUserByUsername(user_username);
    }

    @Override
    public String insertOneUser(User user) {
        int i = userDao.insertOneUser(user);
        if(i==1){
            System.out.println(i);
            return "注册成功";
        }
        return "注册失败";
    }

    public String registerJudgeName(String user_username){
        User user = userDao.selectUserByUsername(user_username);
        if(user != null){
            return "已有此用户";
        }
        return "此用户名可用";
    }
}
