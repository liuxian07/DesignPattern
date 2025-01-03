package com.oliveira.proxy.user;

/**
 * 代理模式-用户服务接口
 */
public interface UserService {

    /**
     * 保存用户
     */
    void saveUser();

    /**
     * 查询用户
     */
    Object findUser(int uid);
}
