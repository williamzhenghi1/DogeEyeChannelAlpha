package com.dogeye.dto;

import lombok.Data;

import javax.persistence.Entity;
import java.util.Date;

@Data
public class ChannelDTO {

    private Integer channelId;
    private String ChannelName;
    private String ChannelEnglishName;
    private double Rate;
    private String Category;
    private String DuringTime;
    private Date CommingTime;
    private String PicUrl;
    private String Prize;
    private String Introduce;
    private Integer IsIndexShow;
    private Integer IndexPos;
    private Integer isD;
    private double Totoal_Stock;
    private String Staff;
}
