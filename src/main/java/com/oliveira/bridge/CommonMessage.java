package com.oliveira.bridge;

/**
 * 桥接模式
 * 扩展抽象化角色
 * RefinedAbstraction
 * 扩展Abstraction角色，改变和修正父类对抽象化的定义。
 * 普通消息
 */
public class CommonMessage extends AbstractMessage {

    public CommonMessage(MessageImplementor impl) {
        super(impl);
    }

    @Override
    public void sendMessage(String toUser, String message) {
        // 对于普通消息，直接调用父类的方法，发送消息即可
        super.sendMessage(toUser, message);
    }
}
