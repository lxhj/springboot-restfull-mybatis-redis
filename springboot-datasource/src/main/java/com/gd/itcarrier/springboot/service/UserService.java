package com.gd.itcarrier.springboot.service;

import com.solo.springcloud.commons.entities.User;

import java.util.List;

/**
 * 逻辑处理接口类
 * @author yuzg
 */
public interface UserService {

    List<User> findAllUser();

    /**
     * 根据id查询信息
     *
     * @param id
     * @return
     */
    User findUserById(Long id);

    /**
     * 新增信息
     *
     * @param User
     * @return
     */
    Long saveUser(User user);

    /**
     * 更新信息
     *
     * @param User
     * @return
     */
    Long updateUser(User User);

    /**
     * 根据id删除信息
     *
     * @param id
     * @return
     */
    Long deleteUser(Long id);

    /**
     * 登录
     *
     * @param User
     * @return
     */
    User login(User user);
}
