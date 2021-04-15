package com.ausware.shardingjdbc.mapper;

import com.ausware.shardingjdbc.entity.Order;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @version 1.0
 * @author： 姚文宇
 * @date： 2021-04-11 13:10
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {
}
