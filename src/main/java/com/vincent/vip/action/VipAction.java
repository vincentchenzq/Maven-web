package com.vincent.vip.action;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vip")
public class VipAction {

    @RequestMapping("/test")
    public Boolean test(){
        System.out.print("进来了test");
        Boolean test = true;
        return test;
    }
}
