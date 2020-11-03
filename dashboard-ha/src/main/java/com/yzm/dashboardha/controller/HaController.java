package com.yzm.dashboardha.controller;

import com.yzm.dashboardha.feign.HaFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HaController {

    @Value("${server.port}")
    private String port;

    @GetMapping("ha")
    public String ha(@RequestParam String name) {
        return "ha" + name + "! " + "端口号：" + port;
    }

    @Autowired
    private HaFeign haFeign;

    @GetMapping("hi")
    public String hi(@RequestParam String name) {
        return haFeign.callHi(name);
    }
}
