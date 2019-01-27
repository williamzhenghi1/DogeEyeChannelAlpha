package com.dogeye.service;

import com.dogeye.pojo.ChannelInfo;

import java.util.List;

public interface ChannelService {

    List<ChannelInfo> findAllChannel();

    ChannelInfo findChannel(Integer id);
}
