package com.oliveira.flyweight.sharegirlfriend;

/**
 * 女朋友类-享元模式中的具体享元类
 */
public class GirlFriend {

    private String name;

    public GirlFriend(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}
