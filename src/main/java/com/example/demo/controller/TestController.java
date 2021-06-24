package com.example.demo.controller;

import com.example.demo.entity.UserEntity;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("test")
public class TestController {
    @Value("${test-hello-j}")
    private String value;
    @Value("${spring.datasource.username}")
    private String database;

    @Autowired
    TestService testService;

    @RequestMapping("/hello")
    public String hello(){
        return value;
    }

    @RequestMapping("/datasource")
    public String datasource(){
        return database;
    }

    @RequestMapping("/get")
    public List<UserEntity> get(){
        return testService.get();
    }
}
