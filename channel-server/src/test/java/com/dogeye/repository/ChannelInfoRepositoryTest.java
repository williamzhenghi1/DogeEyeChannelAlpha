package com.dogeye.repository;

import com.dogeye.channel.ChannelApplication;
import com.dogeye.pojo.ChannelInfo;
import com.netflix.discovery.converters.Auto;
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
public class ChannelInfoRepositoryTest {

    @Autowired
    ChannelInfoRepository channelInfoRepository;

    @Test
    public void getByChannelId() {
        ChannelInfo channelInfo =channelInfoRepository.getBychannelId(1);
        log.info(channelInfo.getCategory());
    }
}