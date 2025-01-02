package com.oliveira.composite.company;

/**
 * 财务部门
 * 叶子结点（Leaf）
 */
public class FinanceDepartment extends Company {

    public FinanceDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
        // 叶子结点无此方法
    }

    @Override
    public void remove(Company company) {
        // 叶子结点无此方法
    }

    @Override
    public void display(int depth) {
        // 输出树形结构
        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(name);
    }

    @Override
    public void duty() {
        System.out.println(name + " 公司财务收支管理");
    }

}
