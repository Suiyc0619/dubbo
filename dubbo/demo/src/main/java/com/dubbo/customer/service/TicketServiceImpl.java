package com.dubbo.customer.service;


import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Component
@Service
public class TicketServiceImpl implements TicketService{

    @Override
    public String getTicket() {
        return "驯龙高手3";
    }
}
