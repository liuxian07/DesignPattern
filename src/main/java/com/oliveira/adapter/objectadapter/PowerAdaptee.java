package com.oliveira.adapter.objectadapter;

/**
 * 适配者角色
 * 输出220V交流电
 */
public class PowerAdaptee {

    public int output220V() {
        int output = 220;
        System.out.println("输出电压：" + output + "V");
        return output;
    }
}
