package com.dogeye.repository;

import com.dogeye.pojo.ComicInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComicInfoRepository extends JpaRepository<ComicInfo,Integer> {

    @Override
    ComicInfo getOne(Integer integer);
}
