package com.oliveira.decorator;

/**
 * 装饰器模式-抽象装饰器
 * 抽象装饰角色
 */
public abstract class CameraDecorator implements Camera {

    protected Camera camera;

    public CameraDecorator(Camera camera) {
        this.camera = camera;
    }

}
