package com.ausware.shardingjdbc.service.impl;

import com.ausware.shardingjdbc.entity.Order;
import com.ausware.shardingjdbc.mapper.OrderMapper;
import com.ausware.shardingjdbc.service.OrderService;
import org.apache.ibatis.annotations.Options;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @version 1.0
 * @author： 姚文宇
 * @date： 2021-04-11 13:12
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    @Options(useGeneratedKeys = true,keyColumn = "orderid",keyProperty = "orderid")
    public Integer addOrder(Order order) {

        return orderMapper.insert(order);
    }
}
