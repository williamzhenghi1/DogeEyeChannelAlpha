package com.dogeye.pojo;

import lombok.Data;
import org.springframework.context.annotation.Bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "celebrity")
public class CelebrityInfo {
    @Id
    @Column(name = "celebrityId")
    private Integer celebrityId;
    private String celebrityName;
    private String worksetID;
    private String Awards;
    private String Job;
    CelebrityInfo(){}
}
