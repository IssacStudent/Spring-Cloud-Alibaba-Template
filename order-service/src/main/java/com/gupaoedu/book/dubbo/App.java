package com.gupaoedu.book.dubbo;

import com.gupaoedu.book.springcloud.IHelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ){
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("classpath*:META-INF/spring/consumer.xml");
        IHelloService iUserService=(IHelloService)context.getBean("helloService");
        System.out.println(iUserService.sayHello("1001"));
    }
}
