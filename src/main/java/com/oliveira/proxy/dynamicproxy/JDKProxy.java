package com.oliveira.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理模式-动态代理-JDK动态代理
 * JDK动态代理步骤
 * 1.创建一个实现InvocationHandler接口的类，重写invoke方法
 * 2.通过Proxy.newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h)方法创建代理对象
 * 3.调用代理对象的方法
 */
public class JDKProxy implements InvocationHandler {
    // 要代理的对象
    private Object target;

    /**
     * 返回要代理的对象
     */
    public Object bind(Object target) {
        this.target = target;
        // 通过Proxy.newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h)方法创建代理对象
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    /**
     * 实现InvocationHandler接口的invoke的回调方法
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long startTime = System.currentTimeMillis();
        // 调用目标对象的方法
        Object rs = method.invoke(target, args);
        long endTime = System.currentTimeMillis();
        System.out.println("耗时：" + (endTime - startTime) + "ms");
        return rs;
    }

}
