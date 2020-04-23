package com.gd.itcarrier.springboot.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.solo.springcloud.commons.entities.PreDotaGame;
import com.gd.itcarrier.springboot.dao.PreDotaGameDao;
import com.gd.itcarrier.springboot.service.PreDotaGameService;

@Service
public class PreDotaGameServiceImpl implements PreDotaGameService {

    @Resource
    private PreDotaGameDao preDotaGameDao;

    @Override
    public int deleteByPrimaryKey(Integer gid) {
        return preDotaGameDao.deleteByPrimaryKey(gid);
    }

    @Override
    public int insert(PreDotaGame record) {
        return preDotaGameDao.insert(record);
    }

    @Override
    public int insertSelective(PreDotaGame record) {
        return preDotaGameDao.insertSelective(record);
    }

    @Override
    public PreDotaGame selectByPrimaryKey(Integer gid) {
        return preDotaGameDao.selectByPrimaryKey(gid);
    }

    @Override
    public int updateByPrimaryKeySelective(PreDotaGame record) {
        return preDotaGameDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PreDotaGame record) {
        return preDotaGameDao.updateByPrimaryKey(record);
    }

}

