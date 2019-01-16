package com.dubbo.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceStart {
    public static void main(String[] args) {
        // 加载applicationContext.xml
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println("start dubbo");
        while (true) {
            Thread.yield();
        }
    }
}
