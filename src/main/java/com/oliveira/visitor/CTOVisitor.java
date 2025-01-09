package com.oliveira.visitor;

/**
 * 访问者模式-具体访问者-CTO访问者
 */
public class CTOVisitor implements Visitor {

    @Override
    public void visit(Manager manager) {
        System.out.println("经理：" + manager.getName() + ", KPI:" + manager.getKpi());
    }

    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师：" + engineer.getName() + ", 代码数量: " + engineer.getCodeLines());
    }
}
