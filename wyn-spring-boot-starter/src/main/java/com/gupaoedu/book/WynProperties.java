package com.gupaoedu.book;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 腾讯课堂搜索【咕泡学院】
 * 官网：www.gupaoedu.com
 * 风骚的Mic 老师
 * create-date: 2020/1/3-19:21
 */
@ConfigurationProperties(prefix = "com.wyn")
public class WynProperties {

    private String name = "localhost";

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
}
