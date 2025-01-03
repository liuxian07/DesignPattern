package com.oliveira.flyweight.sharegirlfriend;

/**
 * 享元模式-共享对象
 * 享元模式是一种结构型设计模式，它通过共享对象来减少内存占用，提高性能
 * 享元模式中有两个重要的角色：享元工厂类和具体享元类
 * 享元工厂类用于创建和管理享元对象，享元对象用于存储不变的数据，这些数据称为内部状态
 * 享元对象的外部状态需要通过外部传入
 * 享元模式中的享元对象是共享的，因此可以被多个客户端共享
 * 享元模式适用于系统中存在大量相似对象的场景，可以减少内存占用，提高性能
 */
public class Test {

    public static void main(String[] args) {
        // 第一次获取对象的时候，会创建一个新的对象
        GirlFriend girlFriend1 = GirlFriendFactory.getGirlFriend("小红");
        GirlFriend girlFriend2 = GirlFriendFactory.getGirlFriend("小蓝");

        // 第二次获取的时候，会直接从缓存中获取
        GirlFriend girlFriend3 = GirlFriendFactory.getGirlFriend("小红");
        GirlFriend girlFriend4 = GirlFriendFactory.getGirlFriend("小蓝");

        System.out.println(girlFriend1 == girlFriend3); // true
        System.out.println(girlFriend2 == girlFriend4); // true
    }

}
