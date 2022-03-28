package com.hnust.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@MapperScan("com.hnust.mapper")
public class MyBatisConfig {

}
