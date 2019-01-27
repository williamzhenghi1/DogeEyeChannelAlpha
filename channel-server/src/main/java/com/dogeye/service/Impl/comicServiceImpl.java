package com.dogeye.service.Impl;

import com.dogeye.pojo.ComicInfo;
import com.dogeye.repository.ComicInfoRepository;
import com.dogeye.service.ComicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class comicServiceImpl implements ComicService {

    @Autowired
    ComicInfoRepository comicInfoRepository;

    @Override
    public ComicInfo findOne(Integer integer) {
        return comicInfoRepository.getOne(integer);
    }
}
