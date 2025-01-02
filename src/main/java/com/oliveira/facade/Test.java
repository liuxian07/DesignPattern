package com.oliveira.facade;

/**
 * 门面模式
 */
public class Test {
    public static void main(String[] args) {
        DeviceFacade deviceFacade = new DeviceFacade();
        // 统一打开设备
        deviceFacade.turnOn();
        // 统一关闭设备
        deviceFacade.turnOff();
    }
}
