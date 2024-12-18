package com.oliveira.decorator;

/**
 * 装饰器模式-测试类
 */
public class Test {

    public static void main(String[] args) {
        // 装饰器模式-相机实现类
        Camera camera = new TakePhotoCamera();
        camera.operation();

        System.out.println("----------");

        // 装饰器模式-美颜装饰器
        Camera beautyCamera = new BeautyCameraDecorator(camera);
        beautyCamera.operation();

        System.out.println("----------");

        // 装饰器模式-滤镜装饰器
        Camera filterCamera = new FilterCameraDecorator(beautyCamera);
        filterCamera.operation();
    }
}
