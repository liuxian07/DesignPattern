package com.oliveira.visitor;

import java.util.Random;

/**
 * 访问者模式-抽象元素
 */
public abstract class Employee {

    private String name;

    private int kpi;

    public Employee(String name) {
        this.name = name;
        this.kpi = new Random().nextInt(10); // 随机生成员工的kpi
    }

    public String getName() {
        return name;
    }

    public int getKpi() {
        return kpi;
    }

    // 接受访问者的访问
    public abstract void accept(Visitor visitor);
}
