package com.bjsxt.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("people")
public interface StudentFeign2 {

    @RequestMapping("/insert3")
    void insert(@RequestParam String mname);
}
