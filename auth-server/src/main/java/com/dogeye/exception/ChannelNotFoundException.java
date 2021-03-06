package com.dogeye.exception;

import com.dogeye.Emus.ChannelEmus;

public class ChannelNotFoundException extends RuntimeException{

    private Integer code;

    public ChannelNotFoundException(Integer code, String message)
    {
        super(message);
        this.code=code;
    }

    public ChannelNotFoundException(ChannelEmus channelEmus)
    {
        super(channelEmus.getMsg());
        this.code=channelEmus.getCode();
    }
}
