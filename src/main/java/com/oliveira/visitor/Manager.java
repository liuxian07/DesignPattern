package com.oliveira.visitor;

import java.util.Random;

/**
 * 访问者模式-具体元素-经理
 */
public class Manager extends Employee {

    public Manager(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    /**
     * 一年做的产品数量
     */
    public int getProducts() {
        return new Random().nextInt(10);
    }
}
