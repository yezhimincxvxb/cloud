package com.yzm.servicefeign.feign;

import com.yzm.servicefeign.feign.back.HiBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hi", fallback = HiBack.class)
public interface HiFeign {

    @GetMapping("hi")
    String callHi(@RequestParam String name);
}
