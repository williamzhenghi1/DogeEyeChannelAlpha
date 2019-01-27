package com.dogeye.service;

import com.dogeye.pojo.ComicInfo;
import org.springframework.stereotype.Service;


public interface ComicService {
    ComicInfo findOne(Integer integer);
}
