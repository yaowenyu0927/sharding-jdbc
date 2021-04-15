package com.ausware.shardingjdbc.mapper;

import com.ausware.shardingjdbc.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @version 1.0
 * @author： 姚文宇
 * @date： 2021-04-10 12:15
 */

@Mapper
public interface UserMapper extends BaseMapper<User> {

}
