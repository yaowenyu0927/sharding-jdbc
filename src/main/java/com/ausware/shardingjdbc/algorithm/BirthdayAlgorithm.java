package com.ausware.shardingjdbc.algorithm;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.text.DateFormat;
import java.util.*;

/**
 * @version 1.0
 * @author： 姚文宇
 * @date： 2021-04-11 10:58
 */
public class BirthdayAlgorithm implements PreciseShardingAlgorithm<Date> {

    //有几个数据源，就写几个
    List<Date> dateList = new ArrayList<>();
    {
        Calendar instance1 = Calendar.getInstance();
        instance1.set(2020,1,1,0,0,0);
        Calendar instance2 = Calendar.getInstance();
        instance2.set(2021,1,1,0,0,0);
        dateList.add(instance1.getTime());
        dateList.add(instance2.getTime());
    }


    /**
     *
     * @param collection    数据源集合
     * @param preciseShardingValue  真实数据值
     * @return
     */
    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<Date> preciseShardingValue) {

        //获取属性数据库的值
        Date date = preciseShardingValue.getValue();
        //获取数据源名称的信息列表
        Iterator<String> iterator = collection.iterator();
        String target = null;
        for (Date s : dateList) {
            target = iterator.next();
            //如果数据晚于指定日期直接返回
            if(date.before(s)){
                break;
            }
        }

        return target;   //最后返回的是：ds0 ds1
    }
}
