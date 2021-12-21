package com.nimo.sample.aop1x.advicetest;

import com.nimo.sample.aop1x.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("aop1x/spring-aop-advice.xml");

        UserService userServiceProxy = context.getBean("userServiceProxy", UserService.class);
        userServiceProxy.createUser("zhangsan", "123456");
    }

}
