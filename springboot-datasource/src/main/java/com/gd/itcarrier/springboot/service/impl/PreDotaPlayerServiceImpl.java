package com.gd.itcarrier.springboot.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.solo.springcloud.commons.entities.PreDotaPlayer;
import com.gd.itcarrier.springboot.dao.PreDotaPlayerDao;
import com.gd.itcarrier.springboot.service.PreDotaPlayerService;

@Service
public class PreDotaPlayerServiceImpl implements PreDotaPlayerService {

    @Resource
    private PreDotaPlayerDao preDotaPlayerDao;

    @Override
    public int deleteByPrimaryKey(Integer pid) {
        return preDotaPlayerDao.deleteByPrimaryKey(pid);
    }

    @Override
    public int insert(PreDotaPlayer record) {
        return preDotaPlayerDao.insert(record);
    }

    @Override
    public int insertSelective(PreDotaPlayer record) {
        return preDotaPlayerDao.insertSelective(record);
    }

    @Override
    public PreDotaPlayer selectByPrimaryKey(Integer pid) {
        return preDotaPlayerDao.selectByPrimaryKey(pid);
    }

    @Override
    public int updateByPrimaryKeySelective(PreDotaPlayer record) {
        return preDotaPlayerDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PreDotaPlayer record) {
        return preDotaPlayerDao.updateByPrimaryKey(record);
    }

}

