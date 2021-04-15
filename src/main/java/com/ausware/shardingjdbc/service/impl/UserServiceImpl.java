package com.ausware.shardingjdbc.service.impl;

import com.ausware.shardingjdbc.entity.User;
import com.ausware.shardingjdbc.mapper.UserMapper;
import com.ausware.shardingjdbc.service.UserService;
import org.apache.ibatis.annotations.Options;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version 1.0
 * @author： 姚文宇
 * @date： 2021-04-10 15:35
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Integer addUser(User user) {
        return userMapper.insert(user);
    }

    @Override
    public List<User> findUser() {
        return userMapper.selectList(null);
    }
}
