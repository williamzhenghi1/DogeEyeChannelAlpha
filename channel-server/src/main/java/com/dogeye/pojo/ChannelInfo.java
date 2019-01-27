package com.dogeye.pojo;
import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
@Entity
@Data
@Table(name="ChannelInfo")
public class ChannelInfo {
    @Id
    @Column(name = "ChannelId")
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
    private Date create_time;
    private Date update_time;


}
