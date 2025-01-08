package com.oliveira.observer;

/**
 * 观察者模式-客户端
 */
public class Client {

    public static void main(String[] args) {
        // 被观察者-我 收集新闻
        NewsSubject me = new Me();

        // 观察者-女朋友、姐姐 订阅新闻
        NewsObserver girlFriend = new GirlFriend();
        NewsObserver sister = new Sister();

        // 订阅新闻
        me.addObserver(girlFriend);
        me.addObserver(sister);

        // 我收集新闻转发给订阅者
        me.notify("北京新闻：今天天气晴朗，气温28度。");

        // 姐姐取消订阅
        me.removeObserver(sister);

        // 我收集新闻转发给订阅者
        me.notify("上海新闻：今天下雨，气温22度。");
    }
}
