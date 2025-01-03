package com.oliveira.proxy.dynamicproxy;

import com.oliveira.proxy.user.UserService;
import com.oliveira.proxy.user.UserServiceImpl;

/**
 * 代理模式-动态代理
 * Spring有一个核心特性AOP，就是基于动态代理实现的，通过动态代理可以在目标方法执行前后做一些额外的操作，比如日志、事务等。
 * 在实际项目中，若使用Spring框架，且需要统计接口的耗时，可以使用Spring AOP，而不需要自己手动实现动态代理。
 */
public class Test2 {

    public static void main(String[] args) {
        JDKProxy jdkProxy = new JDKProxy();
        UserService bind = (UserService) jdkProxy.bind(new UserServiceImpl());
        bind.saveUser();
        bind.findUser(1);
    }
}
