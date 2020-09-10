package com.ric.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description
 * @Author ric
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2020/9/10
 */
@Controller
public class ParamController {

    @RequestMapping("/param")
    public String testParm(String username){
        System.out.println("执行了");
        System.out.println(username);
        return "success";
    }
}
