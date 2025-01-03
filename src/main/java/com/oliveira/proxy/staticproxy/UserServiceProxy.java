package com.oliveira.proxy.staticproxy;

import com.oliveira.proxy.user.UserService;

/**
 * 代理模式-静态代理模式
 */
public class UserServiceProxy implements UserService {

    private UserService userService;

    public UserServiceProxy(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void saveUser() {
        long startTime = System.currentTimeMillis();
        userService.saveUser();
        long endTime = System.currentTimeMillis();
        System.out.println("保存用户耗时：" + (endTime - startTime) + "ms");
    }

    @Override
    public Object findUser(int uid) {
        long startTime = System.currentTimeMillis();
        Object user = userService.findUser(uid);
        long endTime = System.currentTimeMillis();
        System.out.println("查询用户耗时：" + (endTime - startTime) + "ms");
        return user;
    }
}
