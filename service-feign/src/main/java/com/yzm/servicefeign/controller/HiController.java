package com.yzm.servicefeign.controller;

import com.yzm.servicefeign.feign.HiFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Autowired
    private HiFeign hiFeign;

    @GetMapping("hi")
    public String hello(@RequestParam String name) {
        return hiFeign.callHi(name);
    }

}
