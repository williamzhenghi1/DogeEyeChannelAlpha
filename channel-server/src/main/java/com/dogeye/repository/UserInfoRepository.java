package com.dogeye.repository;

import com.dogeye.pojo.CelebrityInfo;
import com.dogeye.pojo.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo,Integer> {
    UserInfo getByid(Integer integer);
}
