package com.dogeye.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    @GetMapping("/getMsg")
    public String getMsg()
    {
        return "msg";
    }
}
