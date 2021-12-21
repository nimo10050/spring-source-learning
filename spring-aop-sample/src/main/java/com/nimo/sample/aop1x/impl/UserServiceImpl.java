package com.nimo.sample.aop1x.impl;

import com.nimo.sample.aop1x.UserService;

public class UserServiceImpl implements UserService {

    public void createUser(String username, String password) {
        System.out.println("username: " + username + ", " + "password: " + password);
    }

}
