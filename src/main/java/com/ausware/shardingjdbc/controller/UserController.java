package com.ausware.shardingjdbc.controller;

import com.ausware.shardingjdbc.entity.User;
import com.ausware.shardingjdbc.mapper.UserMapper;
import com.ausware.shardingjdbc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @version 1.0
 * @author： 姚文宇
 * @date： 2021-04-10 12:16
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/save")
    public String insert() throws ParseException {
        User user = new User();
        user.setName("lisi");
        user.setPassword("222222");
        user.setAge(20);
        user.setSex(0);
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse("1998-09-14");
        user.setBirthday(date);
        userService.addUser(user);
        return "success";
    }


    @GetMapping("/listuser")
    public List<User> finduser(){
        return userService.findUser();
    }


}
