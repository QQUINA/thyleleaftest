package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/5/11.
 */
@RestController
public class MyController {
    @RequestMapping("hello")
    public String hello(){
        return "hello";
    }
}
