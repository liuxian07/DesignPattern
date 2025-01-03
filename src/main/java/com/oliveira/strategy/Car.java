package com.oliveira.strategy;

/**
 * 策略模式-汽车-交通工具实现类
 */
public class Car implements Vehicle {

    @Override
    public void move(String from, String to) {
        System.out.println("开车从" + from + "到" + to);
    }
}
