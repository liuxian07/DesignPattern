package com.oliveira.adapter.classadapter;

/**
 * 使用
 */
public class Test {

    public static void main(String[] args) {
        PowerTarget powerTarget = new PowerAdapter();
        powerTarget.output5V();

        // 因为Java是单继承的关系，Target必须是接口，以便于Adapter可以继承Apaptee类并实现Target接口
        //完成适配的功能，但是这样就导致Adapter里暴露了Adaptee的方法，使用的成本较高
        PowerAdapter powerAdaptee = new PowerAdapter();
        powerAdaptee.output5V();
        powerAdaptee.output220V();
    }
}
