package com.oliveira.visitor;

/**
 * 访问者模式-具体访问者-CEO访问者
 */
public class CEOVisitor implements Visitor {

    @Override
    public void visit(Manager manager) {
        System.out.println("经理：" + manager.getName() + ", 产品数量:" + manager.getProducts());
    }

    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师：" + engineer.getName() + ", KPI: " + engineer.getKpi());
    }
}
