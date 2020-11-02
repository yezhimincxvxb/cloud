package com.yzm.zipkinhi.feign;

import com.yzm.zipkinhi.feign.back.HiBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "zipkin-ha", fallback = HiBack.class)
public interface HiFeign {
    @GetMapping("ha")
    String callHa(@RequestParam String name);
}
