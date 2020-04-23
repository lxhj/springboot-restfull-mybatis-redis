package com.gd.itcarrier.springboot.service;

import com.solo.springcloud.commons.entities.PreDotaGame;

public interface PreDotaGameService {


    int deleteByPrimaryKey(Integer gid);

    int insert(PreDotaGame record);

    int insertSelective(PreDotaGame record);

    PreDotaGame selectByPrimaryKey(Integer gid);

    int updateByPrimaryKeySelective(PreDotaGame record);

    int updateByPrimaryKey(PreDotaGame record);

}

