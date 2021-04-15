package com.ausware.shardingjdbc.service;

import com.ausware.shardingjdbc.entity.Order;
import com.ausware.shardingjdbc.entity.User;

/**
 * @version 1.0
 * @author： 姚文宇
 * @date： 2021-04-11 13:11
 */
public interface OrderService {

    /**
     * 插入订单
     * @param order
     */
    Integer addOrder(Order order);

}
