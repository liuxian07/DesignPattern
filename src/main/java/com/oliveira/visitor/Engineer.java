package com.oliveira.visitor;

import java.util.Random;

/**
 * 访问者模式-具体元素-工程师
 */
public class Engineer extends Employee {

    public Engineer(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    /**
     * 工程师一年的代码数量
     */
    public int getCodeLines() {
        return new Random().nextInt(10 * 10000);
    }
}
