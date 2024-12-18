package com.oliveira.decorator;

/**
 * 装饰器模式-滤镜装饰器
 * 具体装饰角色
 */
public class FilterCameraDecorator extends CameraDecorator {

    public FilterCameraDecorator(Camera camera) {
        super(camera);
    }

    @Override
    public void operation() {
        System.out.println("滤镜");
        camera.operation();
    }
}
