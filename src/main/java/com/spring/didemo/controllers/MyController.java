package com.spring.didemo.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String hello(){
        System.out.println("alo");

        return "Hello world!";
    }

}
