package com.oliveira.command;

/**
 * 命令模式-客户端
 * 命令模式是对命令的封装，将发出命令的责任和执行命令的责任分割开。
 */
public class Client {

    public static void main(String[] args) {
        // 上班了，人员准备
        Barbecuer barbecuer = new Barbecuer();
        BeautifulWaiter beautifulWaiter = new BeautifulWaiter();

        // 6:00 顾客开始点餐
        beautifulWaiter.addCommand(new BakeChickenWingCommand(barbecuer));
        beautifulWaiter.addCommand(new BakeMuttonCommand(barbecuer));

        // 服务员通知厨师开始制作
        beautifulWaiter.notifyBarbecuer();
    }
}
