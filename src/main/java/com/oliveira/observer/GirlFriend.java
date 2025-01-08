package com.oliveira.observer;

/**
 * 观察者模式-具体观察者
 * ConcreteNewsObserver
 */
public class GirlFriend implements NewsObserver {

    @Override
    public void update(String msg) {
        System.out.println("女朋友收到了消息：" + msg);
    }
}
