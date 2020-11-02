package com.yzm.servicefeign.feign.back;

import com.yzm.servicefeign.feign.HiFeign;
import org.springframework.stereotype.Component;

@Component
public class HiBack implements HiFeign {
    @Override
    public String callHi(String name) {
        return "服务挂了";
    }
}
