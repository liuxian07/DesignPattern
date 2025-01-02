package com.oliveira.flyweight.sharegirlfriend;

/**
 * 享元模式-JDK源码-Integer
 */
public class TestInteger {

    public static void main(String[] args) {
        // Integer.valueOf()方法中使用了享元模式
        // Integer类中定义了一个静态内部类IntegerCache，用于缓存-128~127之间的整数对象
        // 当调用Integer.valueOf()方法获取-128~127之间的整数对象时，会直接从缓存中获取
        // 调用new Integer()方法获取的对象不会从缓存中获取
        Integer i1 = Integer.valueOf(100);
        Integer i2 = Integer.valueOf(100);
        Integer i3 = Integer.valueOf(200);
        Integer i4 = Integer.valueOf(200);
        Integer i5 = new Integer(100);
        Integer i6 = new Integer(100);

        System.out.println(i1 == i2); // true
        System.out.println(i3 == i4); // false
        System.out.println(i1 == i5); // false
    }
}
