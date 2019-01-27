package com.dogeye.repository;

import com.dogeye.channel.ChannelApplication;
import com.dogeye.pojo.CelebrityInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;


@SpringBootTest(classes = ChannelApplication.class)
@RunWith(SpringRunner.class)
@Slf4j
public class CelebrityInfoRepositoryTest{

    @Autowired
    CelebrityInfoRepository celebrityInfoRepository;


    @Test
    public void getByCelebrityId() {
        CelebrityInfo celebrityInfo =celebrityInfoRepository.getByCelebrityId(1);
        log.info(celebrityInfo.getWorksetID());
    }
}