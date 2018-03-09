package com.example.springbootdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author xuxiaoshuo 2018/3/8
 */
@Configuration
@MapperScan(basePackages = DataSourceConfig.PACKAGE)
public class DataSourceConfig {

    public static final String PACKAGE = "com.example.springbootdemo.datasource.mapper";
}
