package com.ausware.shardingjdbc.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @version 1.0
 * @author： 姚文宇
 * @date： 2021-04-11 13:07
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "ksd_user_order")
public class Order {

    //主键
    private Long orderid;

    //订单编号
    private String ordernumber;

    //用户id
    private Long userid;

    private String yearmonth;

    //创建时间
    private Date createTime;
}
