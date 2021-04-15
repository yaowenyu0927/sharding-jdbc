package com.ausware.shardingjdbc;

import com.ausware.shardingjdbc.entity.Order;
import com.ausware.shardingjdbc.entity.User;
import com.ausware.shardingjdbc.service.OrderService;
import com.ausware.shardingjdbc.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootTest
class ShardingJdbcApplicationTests {

    @Autowired
    private UserService userService;

    @Autowired
    private OrderService orderService;

//    @Test
//    void contextLoads() throws ParseException {
//            User user = new User();
//            user.setName("luoluo");
//            user.setPassword("1111");
//            user.setAge(19);     //  ds1.ksd_user1
//            user.setSex(2);
//            Date date = new SimpleDateFormat("yyyy-MM-dd").parse("2021-10-19");
//            user.setBirthday(date);
//            userService.addUser(user);
//    }

    @Test
    void contextLoads2() throws ParseException {
            Order order = new Order();
            order.setOrdernumber("125468789");
            order.setCreateTime(new Date());
            order.setYearmonth("202103");
            order.setUserid(2L);
            orderService.addOrder(order);
    }


}
