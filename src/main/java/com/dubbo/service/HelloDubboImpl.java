package com.dubbo.service;

public class HelloDubboImpl implements HelloDubbo{

    public String syaHello() {
        System.out.println("Hello Dubbo>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        return "Provider调用传来的数据(HelloDubbo)！";
    }
}
