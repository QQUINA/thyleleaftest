package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/5/11.
 */
@Controller
@RequestMapping
public class MyController {

    @RequestMapping
    public String hello(){
        return "hello";
    }
}
