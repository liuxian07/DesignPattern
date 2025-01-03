package com.oliveira.strategy;

/**
 * 策略模式-测试类
 */
public class Test {

    public static void main(String[] args) {
        // 使用自行车出行
        TripPlane tripPlane = new TripPlane(new Bike(), "家", "公司");
        tripPlane.travel();

        // 使用飞机出行
        tripPlane = new TripPlane(new Plane(), "家", "公司");
        tripPlane.travel();

        // 使用汽车出行
        tripPlane = new TripPlane(new Car(), "家", "公司");
        tripPlane.travel();
    }
}
