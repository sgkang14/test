package com.ksg.openapi.config;

/**
 * Created by 강성근
 */

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.ksg.openapi.repository")
public class MybatisConfig {
}
