package com.kerwin.apps.cms.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.kerwin.apps.cms.dao")
public class MybatisConfig {

}
