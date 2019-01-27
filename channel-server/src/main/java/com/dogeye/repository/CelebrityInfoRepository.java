package com.dogeye.repository;

import com.dogeye.pojo.CelebrityInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CelebrityInfoRepository extends JpaRepository<CelebrityInfo,Integer> {
    CelebrityInfo getByCelebrityId(Integer integer);
}
