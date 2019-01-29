package com.dubbo.controller;

import com.dubbo.provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TicketController {
    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping("/getTicket")
    public String getTicket(String name){
        return userService.getTicket(name);
    }
    @ResponseBody
    @RequestMapping("/test")
    public String test(String name){
        return "1";
    }
}
