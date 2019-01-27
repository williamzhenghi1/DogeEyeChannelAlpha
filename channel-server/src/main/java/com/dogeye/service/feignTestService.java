package com.dogeye.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name ="AUTH-SERVER" )
public interface feignTestService {

    @GetMapping("/getMsg")
    String getmsg();
}
