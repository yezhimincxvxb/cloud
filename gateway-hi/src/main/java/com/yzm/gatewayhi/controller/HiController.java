package com.yzm.gatewayhi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Value("${server.port}")
    private String port;

    @GetMapping("hi")
    public String hi() {
        return "hi，world! " + "当前端口号：" + port;
    }

    @GetMapping("a")
    public String a() {
        return "hi，A world! " + "当前端口号：" + port;
    }
}
