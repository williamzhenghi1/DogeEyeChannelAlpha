package com.dogeye.repository;

import com.dogeye.pojo.ChannelInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChannelInfoRepository extends JpaRepository<ChannelInfo,Integer> {

    ChannelInfo getBychannelId(Integer integer);


    ChannelInfo save(ChannelInfo channelInfo);
}
