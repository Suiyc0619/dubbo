package com.dubbo.provider.service;


import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.customer.service.TicketService;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Reference
    TicketService ticketService;
    public String getTicket(String name){
        return name + ticketService.getTicket();
    }
}
