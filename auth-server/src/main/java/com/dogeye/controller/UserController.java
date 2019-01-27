package com.dogeye.controller;

import com.dogeye.Utils.ResultsVoUtils;
import com.dogeye.service.UserService;
import com.dogeye.vo.ResultsVo;
import org.apache.http.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;


    @GetMapping("/login")
    ResultsVo UserLogin(HttpServletResponse httpServletResponse,
                        HttpServletRequest httpServletRequest,
                        @RequestParam("userName")String username,
                        @RequestParam("spw")String psw) {

        if(userService.findUserService(httpServletResponse,httpServletRequest,username,psw)){
            return ResultsVoUtils.success(null);
        }else
            return ResultsVoUtils.fail();

    }


}
