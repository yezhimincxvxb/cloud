package com.yzm.dashboardhi.feign.back;

import com.yzm.dashboardhi.feign.HiFeign;
import org.springframework.stereotype.Component;

@Component
public class HiBack implements HiFeign {
    @Override
    public String callHa(String name) {
        return "Ha服务挂了";
    }
}
