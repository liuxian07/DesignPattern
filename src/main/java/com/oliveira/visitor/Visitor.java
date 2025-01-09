package com.oliveira.visitor;

/**
 * 访问者模式-抽象访问者
 */
public interface Visitor {

    // 访问经理类型
    void visit(Manager manager);

    // 访问工程师类型
    void visit(Engineer engineer);
}
