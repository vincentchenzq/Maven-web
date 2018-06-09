package com.vincent.vip.function.impl;

import com.vincent.vip.dao.UserDao;
import com.vincent.vip.enity.UserEnity;
import com.vincent.vip.function.UserFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserFunctionImpl implements UserFunction {
    @Value("${test}")
    private String test;

    @Autowired
    private UserDao userDao;

    @Override
    public UserEnity login(String userId, String password) throws Exception{
        UserEnity userEnity = userDao.selectByUserId(userId);
        System.out.println(this.test);
        return userEnity;
    }

}
