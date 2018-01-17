package com.jk.controller;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/la")
    public String home(){

        System.out.print("ideaTEst1");
        return "hello world";
    }
}
