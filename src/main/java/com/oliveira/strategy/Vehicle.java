package com.oliveira.strategy;

/**
 * 策略模式-交通工具抽象类
 */
public interface Vehicle {

    /**
     * 交通方式
     */
    void move(String from, String to);
}
