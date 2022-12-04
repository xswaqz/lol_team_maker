package com.lolteammaker.backend.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.lolteammaker.backend.model.dao")
public class DBConfig {

}
