package com.yzm.gateway_a.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @GetMapping("hi")
    public String hi() {
        System.out.println("hello world!");
        return "hello world!";
    }
}
