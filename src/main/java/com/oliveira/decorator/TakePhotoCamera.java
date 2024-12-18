package com.oliveira.decorator;

/**
 * 装饰器模式-相机实现类
 * 具体构件角色
 */
public class TakePhotoCamera implements Camera {

    @Override
    public void operation() {
        System.out.println("拍照");
    }

}
