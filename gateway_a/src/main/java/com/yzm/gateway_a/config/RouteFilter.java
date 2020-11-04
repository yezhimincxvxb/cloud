package com.yzm.gateway_a.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@Configuration
@RestController
public class RouteFilter {

    /**
     * 访问：localhost:8021/get 或 curl localhost:8021/get
     * 路由匹配成功，跳转到：http://httpbin.org:80/get
     * 在请求头中可以看到： "Hello": "World"
     */
    @Bean
    public RouteLocator routes_01(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(p -> p
                        .path("/get")
                        .filters(f -> f.addRequestHeader("Hello", "World"))
                        .uri("http://httpbin.org:80"))
                .build();
    }

    /**
     * curl -H Host:www.hystrix.com localhost:8021/delay/3
     */
    @Bean
    public RouteLocator hystrix(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(p -> p
                        .host("*.hystrix.com")
                        .filters(f -> f
                                .hystrix(config -> config
                                        .setName("mycmd")
                                        .setFallbackUri("forward:/fallback")))
                        .uri("http://httpbin.org:80"))
                .build();
    }

    @GetMapping("/fallback")
    public Mono<String> fallback() {
        return Mono.just("fallback");
    }

    @Bean
    public RouteLocator hystrix_02(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(p -> p
                        .host("*.yzm.com")
                        .filters(f -> f
                                .hystrix(config -> config
                                        .setName("test")
                                        .setFallbackUri("forward:/fallback")))
                        .uri("http://localhost:8021"))
                .build();
    }

}
