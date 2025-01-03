package com.oliveira.proxy.staticproxy;

import com.oliveira.proxy.user.UserServiceImpl;

/**
 * 代理模式-静态代理
 */
public class Test1 {

    public static void main(String[] args) {
        UserServiceProxy userServiceProxy = new UserServiceProxy(new UserServiceImpl());
        userServiceProxy.saveUser();
        userServiceProxy.findUser(1);
    }
}
