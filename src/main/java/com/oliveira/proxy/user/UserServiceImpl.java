package com.oliveira.proxy.user;

/**
 * 代理模式-用户服务接口实现类
 */
public class UserServiceImpl implements UserService {

    @Override
    public void saveUser() {
        System.out.println("调用dao层保存用户");
    }

    @Override
    public Object findUser(int uid) {
        System.out.println("调用dao层查询用户");
        return "user{name:'张三', age:18}";
    }
}
