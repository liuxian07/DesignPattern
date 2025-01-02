package com.oliveira.composite.company;

/**
 * 声明一个接口，用于访问和管理Component的子部件
 */
public abstract class Company {

    protected String name;

    public Company(String name) {
        this.name = name;
    }

    /**
     * 添加节点
     */
    public abstract void add(Company company);

    /**
     * 删除节点
     */
    public abstract void remove(Company company);

    /**
     * 显示
     */
    public abstract void display(int depth);

    /**
     * 职责
     */
    public abstract void duty();
}
