package com.gd.itcarrier.springboot.service;

import com.solo.springcloud.commons.entities.PreDotaPlayer;

public interface PreDotaPlayerService {


    int deleteByPrimaryKey(Integer pid);

    int insert(PreDotaPlayer record);

    int insertSelective(PreDotaPlayer record);

    PreDotaPlayer selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(PreDotaPlayer record);

    int updateByPrimaryKey(PreDotaPlayer record);

}

