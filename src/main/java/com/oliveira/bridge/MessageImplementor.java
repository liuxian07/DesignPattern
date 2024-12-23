package com.oliveira.bridge;

/**
 * 桥接模式
 * 实现接口
 * Implementor
 * 定义实现类的接口，该接口不一定要与Abstraction的接口完全一致，实际上这两个接口可以完全不一样。
 * 通常是由Implementor接口提供基本的操作，而Abstraction定义的接口可能会做更多更复杂的操作。
 */
public interface MessageImplementor {

    /**
     * 所有的消息类型的统一发送方法
     *
     * @param toUser  接收人
     * @param message 发送的消息
     */
    void send(String toUser, String message);
}
