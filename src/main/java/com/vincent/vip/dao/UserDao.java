package com.vincent.vip.dao;

import com.vincent.vip.enity.UserEnity;

public interface UserDao {
    UserEnity selectByUserId(String userId) throws Exception;

}
