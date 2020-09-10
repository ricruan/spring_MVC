package com.ric.controller;

import com.ric.entity.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description
 * @Author ric
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2020/9/10
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @RequestMapping("/user")
    public String login(Account account){
        System.out.println("account = " + account);
        return "success";
    }

    @RequestMapping("/getRequestBody")
    public String getRequestBody(@RequestBody String body){
        System.out.println(body);
        return "success";
    }
}
