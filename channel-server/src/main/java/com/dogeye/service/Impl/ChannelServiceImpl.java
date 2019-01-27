package com.dogeye.service.Impl;

import com.dogeye.Emus.ChannelEmus;
import com.dogeye.exception.ChannelNotFoundException;
import com.dogeye.pojo.ChannelInfo;
import com.dogeye.repository.ChannelInfoRepository;
import com.dogeye.service.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ChannelServiceImpl implements ChannelService {

    @Autowired
    ChannelInfoRepository channelInfoRepository;

    @Override
    public List<ChannelInfo> findAllChannel() {

        return channelInfoRepository.findAll();
    }

    @Override
    public ChannelInfo findChannel(Integer id) {

        Optional<ChannelInfo> channelInfo = Optional.ofNullable(channelInfoRepository.getBychannelId(id));
//        Optional<ChannelInfo> channelInfoOptional = channelInfoRepository.getBychannelId(id);
        if(!channelInfo.isPresent())
            throw new ChannelNotFoundException(ChannelEmus.NOT_FOUNT_Faild);

        return channelInfo.get();
    }
}
