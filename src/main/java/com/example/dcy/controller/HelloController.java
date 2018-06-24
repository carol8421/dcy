package com.example.dcy.controller;

import com.example.dcy.service.Helloservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController //controller注解,注入到spring里面
public class HelloController {
//    private final Logger log = Logger.getLogger(this.getClass().toString());   //日志输出
//
//    private final Helloservice helloservice;
//
//    @Autowired
//    public HelloController(Helloservice helloservice) {
//        this.helloservice = helloservice;
//    }
//
//    @RequestMapping("/hello")
//    public String index() {
//        log.info("这是hello");
//        return helloservice.sayHello();
//    }
}