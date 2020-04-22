package com.gd.itcarrier.springboot.dao;



import com.solo.springcloud.commons.entities.User;
import org.apache.ibatis.annotations.Param;


import java.util.List;

/**
 * DAO接口类
 *
 * @author yuzg
 */
public interface UserDao {

    List<User> findAllUser();
    User findById(@Param("id") Long id);
    Long saveUser(User user);
    Long updateUser(User user);
    Long deleteUser(Long id);
    User login(User user);
}
