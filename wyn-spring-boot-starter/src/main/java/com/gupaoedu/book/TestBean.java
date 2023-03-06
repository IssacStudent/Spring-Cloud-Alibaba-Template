package com.gupaoedu.book;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestBean {
    private String name;
    public TestBean(String name) {
        this.name = name;
    }

    public void sayHello() {
        log.info("Hello, I'm " + name);
    }
}
