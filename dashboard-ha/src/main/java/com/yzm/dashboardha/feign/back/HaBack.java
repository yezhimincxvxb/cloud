package com.yzm.dashboardha.feign.back;

import com.yzm.dashboardha.feign.HaFeign;
import org.springframework.stereotype.Component;

@Component
public class HaBack implements HaFeign {
    @Override
    public String callHi(String name) {
        return "Hi服务挂了";
    }
}
