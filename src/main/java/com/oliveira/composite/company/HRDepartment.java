package com.oliveira.composite.company;

/**
 * HR部门
 * 叶子结点（Leaf）
 */
public class HRDepartment extends Company {

    public HRDepartment(String name) {
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
        System.out.println(name + " 员工招聘培训管理");
    }
}
