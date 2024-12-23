package com.oliveira.bridge;

/**
 * 桥接模式-测试类
 * Client
 * 1. 桥接模式的核心是把抽象化和实现化解耦，使得二者可以独立变化。
 * 2. 相对与拓展，只需要增加的AbstractMessage的子类和MessageImplementor的子类即可。
 */
public class Me {
    public static void main(String[] args) {
        // 定义一个发送消息的方式
        MessageImplementor weixinMessage = new WeixinMessage();

        // 定义一个普通消息
        AbstractMessage commonMessage = new CommonMessage(weixinMessage);
        commonMessage.sendMessage("小明", "2024年12月02日，生日快乐！");

        // 定义一个加急消息
        AbstractMessage urgencyMessage = new UrgencyMessage(weixinMessage);
        urgencyMessage.sendMessage("小红", "2024年12月02日，生日快乐！");


        // 定义一个发送消息的方式，这次使用短信发送
        MessageImplementor smsMessage = new SMSMessage();
        AbstractMessage commonMessage2 = new CommonMessage(smsMessage);
        commonMessage2.sendMessage("小明", "2024年12月02日，生日快乐！");

        AbstractMessage urgencyMessage2 = new UrgencyMessage(smsMessage);
        urgencyMessage2.sendMessage("小红", "2024年12月02日，生日快乐！");

    }
}
