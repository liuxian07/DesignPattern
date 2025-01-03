package com.oliveira.strategy;

/**
 * 出行计划-上下文切换
 */
public class TripPlane {

    private Vehicle vehicle;
    private String from;
    private String to;

    public TripPlane(Vehicle vehicle, String from, String to) {
        this.vehicle = vehicle;
        this.from = from;
        this.to = to;
    }

    /**
     * 进行拓展
     * 前置工作：资源的初始化
     * 后续工作：资源的释放
     */
    public void travel() {
        // 前置处理
        vehicle.move(from, to);
        // 后置处理
    }
}
