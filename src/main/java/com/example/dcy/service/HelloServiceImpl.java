package com.example.dcy.service;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements Helloservice{
    @Override
    public String sayHello() {
        return "Hello Spring Boot";
    }
}
