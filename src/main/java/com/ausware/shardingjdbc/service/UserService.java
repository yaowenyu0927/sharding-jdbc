package com.ausware.shardingjdbc.service;

import com.ausware.shardingjdbc.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @version 1.0
 * @author： 姚文宇
 * @date： 2021-04-10 15:35
 */
public interface UserService {
    /**
     * 插入用户
     * @param user
     */
    Integer addUser(User user);

    /**
     * 查询全部用户
     * @return
     */
    List<User> findUser();
}
