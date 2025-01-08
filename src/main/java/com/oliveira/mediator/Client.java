package com.oliveira.mediator;

public class Client {

    public static void main(String[] args) {
        // 创建邮局
        PostOffice postOffice = new PostOfficeImpl();

        // 创建我和你
        People me = new Me(postOffice, "我在广州");
        People you = new You(postOffice, "你在东京");

        // 添加到邮局地址
        postOffice.addPeople(me);
        postOffice.addPeople(you);

        // 我给你发信
        me.sendLetter("你好，我是A", "你在东京");

        System.out.println("====================================");
        // 你给我发信
        you.sendLetter("你好，我是B", "我在广州");
    }
}
