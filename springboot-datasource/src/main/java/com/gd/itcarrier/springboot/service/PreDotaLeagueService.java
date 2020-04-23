package com.gd.itcarrier.springboot.service;

import com.solo.springcloud.commons.entities.PreDotaLeague;

public interface PreDotaLeagueService {


    int deleteByPrimaryKey(Integer id);

    int insert(PreDotaLeague record);

    int insertSelective(PreDotaLeague record);

    PreDotaLeague selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PreDotaLeague record);

    int updateByPrimaryKey(PreDotaLeague record);

}

