package com.vincent.vip.function;

import com.vincent.vip.enity.UserEnity;

public interface UserFunction {
    UserEnity login(String userId,String password) throws Exception;
}
