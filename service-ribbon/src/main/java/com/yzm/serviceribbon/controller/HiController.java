package com.yzm.serviceribbon.controller;

import com.yzm.serviceribbon.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Autowired
    private HiService hiService;

    @GetMapping("hi")
    public String hello(@RequestParam String name) {
        return hiService.callHi(name);
    }

}
