package com.ausware.shardingjdbc.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @version 1.0
 * @author： 姚文宇
 * @date： 2021-04-10 12:13
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("ksd_user")
public class User implements Serializable {

    private static final long serialVersionUID=1L;

    //@TableId(value = "id",type = IdType.AUTO)

    private Long id;
    //昵称
    private String name;
    //密码
    private String password;
    // 年龄
    private Integer age;
    //性别
    private Integer sex;
    //生日
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
}
