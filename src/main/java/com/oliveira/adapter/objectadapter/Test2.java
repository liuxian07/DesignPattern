package com.oliveira.adapter.objectadapter;


/**
 * 测试类
 */
public class Test2 {

    public static void main(String[] args) {
        // 适配器模式-对象适配器
        PowerAdapter target = new PowerAdapter(new PowerAdaptee());
        target.output5V();
    }
}
