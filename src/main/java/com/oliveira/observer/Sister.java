package com.oliveira.observer;

/**
 * 观察者模式-具体观察者
 */
public class Sister implements NewsObserver {

    @Override
    public void update(String msg) {
        System.out.println("姐姐收到了消息：" + msg);
    }
}
