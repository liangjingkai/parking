package com.bjsxt.feign;

import org.apache.ibatis.annotations.Insert;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("teacher")
public interface StudentFeign {

    @RequestMapping("/insert2")
    Integer insert(@RequestParam String tname);
}
