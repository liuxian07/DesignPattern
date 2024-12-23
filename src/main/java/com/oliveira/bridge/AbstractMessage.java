package com.oliveira.bridge;

/**
 * 桥接模式
 * 抽象类
 * Abstraction
 */
public abstract class AbstractMessage {

    /**
     * 持有一个实现部分的对象
     */
    protected MessageImplementor impl;

    /**
     * 构造方法，传入实现部分的对象
     */
    public AbstractMessage(MessageImplementor impl) {
        this.impl = impl;
    }

    /**
     * 发送消息，转调实现部分的方法
     * send这个方法，不要求和MessageImplementor接口的方法一致
     */
    public void sendMessage(String toUser, String message) {
        this.impl.send(toUser, message);
    }
}
