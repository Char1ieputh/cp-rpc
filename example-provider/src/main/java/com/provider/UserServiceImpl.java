package com.provider;

import com.model.User;
import com.service.UserService;

public class UserServiceImpl implements UserService {
    public User getUser(User user) {
        System.out.println("用户名：" + user.getName());
        return user;
    }
}