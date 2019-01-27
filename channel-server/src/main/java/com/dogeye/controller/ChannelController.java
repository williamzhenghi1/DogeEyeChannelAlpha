package com.dogeye.controller;

import com.dogeye.Utils.ResultsVoUtils;
import com.dogeye.converter.ChannelInfo2ChannelDTO;
import com.dogeye.dto.ChannelDTO;
import com.dogeye.service.ChannelService;
import com.dogeye.service.feignTestService;
import com.dogeye.vo.ResultsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/channel")
public class ChannelController {

    @Autowired
    ChannelService channelService;

    @Autowired
    feignTestService fService;
    /**
     * save和findAll都是原生的
     * @return
     */
    @GetMapping("/allChannel")
    public ResultsVo getAllChannel(){
        return ResultsVoUtils.success(ChannelInfo2ChannelDTO.listConverter(channelService.findAllChannel()));
    }

    @GetMapping("/getChannel")
    public ResultsVo getChannel(@RequestParam("id") Integer id)
    {
        ChannelDTO channelDTO = ChannelInfo2ChannelDTO.convert(channelService.findChannel(id));

        return ResultsVoUtils.success(channelDTO);
    }

    @GetMapping("/getMsg")
    public String getMsg(){
        return fService.getmsg();
    }
}
