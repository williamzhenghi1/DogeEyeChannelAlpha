package com.dogeye.service.Impl;

import com.dogeye.Const.CookieConst;
import com.dogeye.Utils.CookieUtils;
import com.dogeye.Utils.EncryptUtil;
import com.dogeye.Utils.ResultsVoUtils;
import com.dogeye.pojo.UserInfo;
import com.dogeye.repository.UserInfoRepository;
import com.dogeye.service.UserService;
import com.dogeye.vo.ResultsVo;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserInfoRepository userInfoRepository;

    @Resource
    private StringRedisTemplate stringRedisTemplate;



    @Override
    public boolean findUserService(HttpServletResponse httpServletResponse, HttpServletRequest httpServletRequest, String userName, String password) {

        //验证前先检查是否已经登录
        //验证uuid里面的值是否和redis token对应的一样

        String userUuid =CookieUtils.getCookie(httpServletRequest,"token");

        if(null != userUuid )
            if(null !=stringRedisTemplate.opsForValue().get(userUuid))
                return true;

        //MD5加密

        //存在验证
        Optional<UserInfo>userInfoOptional= Optional.ofNullable(userInfoRepository.getByUsernameAndPassword(userName, password));
        //权限验证
        if(!userInfoOptional.isPresent())
        {
            throw new RuntimeException("user not found");
        }

        String uuid = StringUtils.join(UUID.randomUUID().toString().split("-"));

        //添加cookie
        CookieUtils.setCookie(httpServletResponse, CookieConst.TOKEN,uuid,CookieConst.expireTime);
        //添加redis token
        stringRedisTemplate.opsForValue().set(uuid,userInfoOptional.get().getUsername(),CookieConst.expireTime,TimeUnit.SECONDS);

        return true;
    }
}
