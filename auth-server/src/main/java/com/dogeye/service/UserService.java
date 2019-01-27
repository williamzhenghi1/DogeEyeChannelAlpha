package com.dogeye.service;

import com.dogeye.pojo.UserInfo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface UserService {

    boolean findUserService(HttpServletResponse httpServletResponse, HttpServletRequest httpServletRequest, String userName, String password);
}
