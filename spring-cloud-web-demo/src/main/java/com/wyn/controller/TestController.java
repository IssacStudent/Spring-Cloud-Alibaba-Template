package com.wyn.controller;

import com.gupaoedu.book.TestBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestController {

    @Autowired
    private TestBean testBean;

    @GetMapping(value = "/test")
    public void test(
    ) {
        testBean.sayHello();
    }
}
