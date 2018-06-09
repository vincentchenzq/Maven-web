package com.vincent.vip.web.handler;

import com.alibaba.fastjson.JSON;
import com.vincent.common.LoggerUtils;
import com.vincent.common.MyRuntimeException;
import com.vincent.vip.enity.UserEnity;
import com.vincent.vip.function.UserFunction;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class LoginHandler {


    @Autowired
    UserFunction fun;

    @RequestMapping("/login.do")
    public String login(String userId, String password, HttpSession session){
        try {
            if(userId==null || userId.length()==0){
                throw new MyRuntimeException("业务报错");
            }
            if(password==null || password.length()==0){
                throw new Exception("不知道什么错");
            }
            UserEnity userEnity = fun.login(userId, password);
            session.setAttribute("currentUser", JSON.toJSONString(userEnity));
            LoggerUtils.info(JSON.toJSONString(userEnity));
        }catch (MyRuntimeException e){
            LoggerUtils.error("业务报错", e);
        }catch(Exception e){
            LoggerUtils.error("不知道什么错。。",e);
        }

        return "login";
    }
    //与loginAction的访问路径重复
    @RequestMapping("/test1")
    @ResponseBody
    public Boolean test(){
        System.out.print("进来了test");
        Boolean test = true;
        return test;
    }

    /*
    然后就能掉 /test1 了吗？
     */

}
