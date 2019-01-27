package com.dogeye.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class ComicInfo {

    @Id
    @Column(name = "Id")
    private int Id;
    private String title;
    private String picUrl;
    private String pressTime;
    private String alians;
    private int statusl;
    private String discription;
    private int rate;
    private Date createTime;
    private Date updated_at;
}
