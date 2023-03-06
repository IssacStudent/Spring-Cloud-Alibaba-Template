package com.gupaoedu.book;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 腾讯课堂搜索【咕泡学院】
 * 官网：www.gupaoedu.com
 * 风骚的Mic 老师
 * create-date: 2020/1/3-19:30
 */
@Configuration
@EnableConfigurationProperties(WynProperties.class)
@Slf4j
public class WynAutoConfiguration {
    @Autowired
    WynProperties wynProperties;
    @Bean
    TestBean wynAutoConfiguration(){
        log.info("creating TestBean:" + wynProperties.getName());
        return new TestBean(wynProperties.getName());
    }
}
