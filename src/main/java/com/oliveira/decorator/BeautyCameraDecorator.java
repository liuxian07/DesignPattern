package com.oliveira.decorator;

/**
 * 装饰器模式-美颜装饰器
 * 具体装饰角色
 */
public class BeautyCameraDecorator extends CameraDecorator {

    public BeautyCameraDecorator(Camera camera) {
        super(camera);
    }

    @Override
    public void operation() {
        System.out.println("美颜");
        camera.operation();
    }
}
