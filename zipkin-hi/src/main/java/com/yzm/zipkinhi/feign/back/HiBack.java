package com.yzm.zipkinhi.feign.back;

import com.yzm.zipkinhi.feign.HiFeign;
import org.springframework.stereotype.Component;

@Component
public class HiBack implements HiFeign {
    @Override
    public String callHa(String name) {
        return "Hi服务挂了";
    }
}
