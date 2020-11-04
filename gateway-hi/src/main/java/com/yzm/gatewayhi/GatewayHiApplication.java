package com.yzm.gatewayhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GatewayHiApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayHiApplication.class, args);
    }

}
