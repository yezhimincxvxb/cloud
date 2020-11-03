package com.yzm.dashboardhi.controller;

import com.yzm.dashboardhi.feign.HiFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Value("${server.port}")
    private String port;

    @GetMapping("hi")
    public String hi(@RequestParam String name) {
        return "hi" + name + "! " + "端口号：" + port;
    }

    @Autowired
    private HiFeign hiFeign;

    @GetMapping("ha")
    public String ha(@RequestParam String name) {
        return hiFeign.callHa(name);
    }
}
