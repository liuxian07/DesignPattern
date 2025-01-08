package com.oliveira.observer;

/**
 * 观察者模式-抽象观察者
 * 新闻观察者
 */
public interface NewsObserver {

    void update(String msg);
}
