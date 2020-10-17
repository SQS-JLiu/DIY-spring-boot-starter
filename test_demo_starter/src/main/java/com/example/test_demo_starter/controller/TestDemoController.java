package com.example.test_demo_starter.controller;

import com.example.demospringbootstarterautoconfigurer.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestDemoController {

    @Autowired
    private DemoService demoService;


    @GetMapping("/test")
    public String testDemo(){
        return demoService.sayHello("Jack");
    }
}
