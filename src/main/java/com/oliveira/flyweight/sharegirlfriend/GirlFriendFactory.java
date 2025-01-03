package com.oliveira.flyweight.sharegirlfriend;

import java.util.HashMap;
import java.util.Map;

/**
 * 女朋友工厂类-享元模式中的工厂类
 * 定义一个集合用于存储享元对象，实现享元对象的共享
 */
public class GirlFriendFactory {

    private static Map<String, GirlFriend> girlFriendMap = new HashMap<>();


    /**
     * 这里就是享元工厂类的核心方法，用于获取享元对象-共享对象
     *
     * @param name 对象名称
     * @return 共享对象
     */
    public static GirlFriend getGirlFriend(String name) {
        // 1. 先从缓存中获取对象
        // 2. 若对象不存在，则创建一个新的对象，并将其放入缓存中
        // 3. 最后返回对象
        // 暂不考虑线程安全问题
        GirlFriend girlFriend = girlFriendMap.get(name);
        if (girlFriend == null) {
            girlFriend = new GirlFriend(name);
            girlFriendMap.put(name, girlFriend);
        }
        return girlFriend;
    }

}
