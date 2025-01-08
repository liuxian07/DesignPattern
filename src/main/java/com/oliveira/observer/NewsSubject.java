package com.oliveira.observer;

/**
 * 观察者模式-抽象被观察者角色
 */
public interface NewsSubject {

    void addObserver(NewsObserver observer);

    void removeObserver(NewsObserver observer);

    void notify(String mgs);
}
