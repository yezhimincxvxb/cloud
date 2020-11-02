package com.yzm.zipkinha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class ZipkinHaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZipkinHaApplication.class, args);
    }

}
