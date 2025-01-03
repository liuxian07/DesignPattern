package com.oliveira.strategy;

/**
 * 策略模式-自行车-交通工具实现类
 */
public class Bike implements Vehicle {

    @Override
    public void move(String from, String to) {
        System.out.println("骑自行车从" + from + "到" + to);
    }
}
