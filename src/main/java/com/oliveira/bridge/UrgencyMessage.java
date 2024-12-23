package com.oliveira.bridge;

/**
 * 桥接模式
 * 扩展抽象化角色
 * RefinedAbstraction
 * 扩展Abstraction角色，改变和修正父类对抽象化的定义。
 * 加急消息
 */
public class UrgencyMessage extends AbstractMessage {

    public UrgencyMessage(MessageImplementor impl) {
        super(impl);
    }

    @Override
    public void sendMessage(String toUser, String message) {
        // 对于加急消息，对消息进行特殊处理，增加一条加急信息
        message = "加急：" + message;
        super.sendMessage(toUser, message);
    }

    /**
     * 扩展自己的新功能：监控某消息的处理过程
     */
    public Object watch(String messageId) {
        // 获取相应的数据，组织成监控的数据对象，然后返回
        return "监控消息的处理过程：" + messageId;
    }
}
