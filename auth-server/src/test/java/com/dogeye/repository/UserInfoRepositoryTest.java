package com.dogeye.repository;

import com.dogeye.auth.AuthApplication;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest(classes = AuthApplication.class)
@RunWith(SpringRunner.class)
@Slf4j
public class UserInfoRepositoryTest {

    @Autowired
    UserInfoRepository userInfoRepository;

    @Test
    public void getByUsernameAndPassword() {
        log.info(userInfoRepository.getByUsernameAndPassword("1","1").getId());
    }
}