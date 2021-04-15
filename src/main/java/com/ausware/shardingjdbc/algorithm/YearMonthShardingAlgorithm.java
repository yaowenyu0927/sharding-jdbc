package com.ausware.shardingjdbc.algorithm;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.util.Collection;

/**
 * @version 1.0
 * @author： 姚文宇
 * @date： 2021-04-11 13:00
 */
public class YearMonthShardingAlgorithm implements PreciseShardingAlgorithm<String> {
    private  static  final String SPLITTER = "_";
    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<String> preciseShardingValue) {

        String  tbName = preciseShardingValue.getLogicTableName()+"_"+preciseShardingValue.getValue();
        System.out.println("Sharding input:"+preciseShardingValue.getValue()+"，output:{}"+tbName);
        return tbName;
    }
}
