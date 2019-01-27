package com.dogeye.converter;

import com.dogeye.dto.ChannelDTO;
import com.dogeye.pojo.ChannelInfo;
import com.fasterxml.jackson.databind.util.BeanUtil;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

public class ChannelInfo2ChannelDTO {
    public static ChannelDTO convert(ChannelInfo channelInfo)
    {
        ChannelDTO channelDTO =new ChannelDTO();
        BeanUtils.copyProperties(channelInfo,channelDTO);
        return channelDTO;
    }

    public static List<ChannelDTO> listConverter(List<ChannelInfo> channelInfoList)
    {
        List<ChannelDTO> channelDTOList = new ArrayList<>();
        for(ChannelInfo channelInfo :channelInfoList)
        {
            channelDTOList.add(convert(channelInfo));
        }
        return channelDTOList;
    }
}
