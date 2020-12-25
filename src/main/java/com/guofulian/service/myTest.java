package com.guofulian.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myTest {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("ioc.xml");
        System.out.println(app.getBean("person").toString());
    }
}
