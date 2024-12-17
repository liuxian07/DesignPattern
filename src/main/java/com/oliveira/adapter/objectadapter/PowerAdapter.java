package com.oliveira.adapter.objectadapter;


/**
 * 适配器角色 - 对象适配器模式
 * 将220V交流电转换为5V直流电
 */
public class PowerAdapter implements PowerTarget {

    private PowerAdaptee powerAdaptee;

    public PowerAdapter(PowerAdaptee powerAdaptee) {
        this.powerAdaptee = powerAdaptee;
    }


    @Override
    public int output5V() {
        int output = powerAdaptee.output220V() / 44;  //220V交流电转换为5V直流电
        System.out.println("输出电压：" + output + "V");
        return output;
    }

}
