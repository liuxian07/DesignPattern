package com.oliveira.bridge;

/**
 * 桥接模式
 * 具体实现类
 * ConcreteImplementor
 * 实现Implementor接口，给出实现的具体逻辑。
 */
public class WeixinMessage implements MessageImplementor {

    /**
     * 通过微信发送消息
     *
     * @param toUser  接收人
     * @param message 发送的消息
     */
    @Override
    public void send(String toUser, String message) {
        System.out.println("使用微信发送消息：" + message + " 给 " + toUser);
    }

}
