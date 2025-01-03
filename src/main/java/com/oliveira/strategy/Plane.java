package com.oliveira.strategy;

/**
 * 策略模式-飞机-交通工具实现类
 */
public class Plane implements Vehicle {

    @Override
    public void move(String from, String to) {
        System.out.println("坐飞机从" + from + "到" + to);
    }
}
