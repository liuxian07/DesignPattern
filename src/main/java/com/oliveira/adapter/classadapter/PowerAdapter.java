package com.oliveira.adapter.classadapter;

/**
 * 适配器角色 - 类适配器模式
 * 将220V交流电转换为5V直流电
 */
public class PowerAdapter extends PowerAdaptee implements PowerTarget {

    @Override
    public int output5V() {
        int output = output220V() / 44;  //220V交流电转换为5V直流电
        System.out.println("输出电压：" + output + "V");
        return output;
    }
}
