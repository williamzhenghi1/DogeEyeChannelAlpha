package com.dogeye.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name="user_info")
public class UserInfo {
    @Id
    private String id;
    private String username;
    private String password;
    private String openid;
    private Integer role;
    private Date create_time;
    private Date Update_time;
    UserInfo(){}
}
