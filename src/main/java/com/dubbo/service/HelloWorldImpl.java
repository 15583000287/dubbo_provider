package com.dubbo.service;

public class HelloWorldImpl implements HelloWorld {
    public String helloWorld() {
        System.out.println("Hello World>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        return "Provider调用传来的数据(HelloWorld)！";
    }
}
