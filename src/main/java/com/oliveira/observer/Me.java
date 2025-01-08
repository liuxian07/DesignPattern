package com.oliveira.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 观察者模式-具体被观察者角色
 * 被观察者：也就是新闻发布者，当有新消息发布时，会通知所有的观察者
 */
public class Me implements NewsSubject {

    private List<NewsObserver> newsObserverList = new ArrayList<>();

    @Override
    public void addObserver(NewsObserver observer) {
        newsObserverList.add(observer);
    }

    @Override
    public void removeObserver(NewsObserver observer) {
        newsObserverList.remove(observer);
    }

    @Override
    public void notify(String mgs) {
        for (NewsObserver newsObserver : newsObserverList) {
            newsObserver.update(mgs);
        }
    }
}
