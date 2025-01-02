package com.oliveira.facade;

/**
 * 门面类
 */
public class DeviceFacade {

    private SubSystemLight light;
    private SubSystemTV tv;
    private SubSystemSunblind sunblind;

    public DeviceFacade() {
        this.light = new SubSystemLight();
        this.tv = new SubSystemTV();
        this.sunblind = new SubSystemSunblind();
    }

    public void turnOn() {
        light.turnOn();
        tv.turnOn();
        sunblind.up();
    }

    public void turnOff() {
        light.turnOff();
        tv.turnOff();
        sunblind.down();
    }
}
