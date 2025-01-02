package com.oliveira.composite.company;

import java.util.ArrayList;
import java.util.List;

/**
 * 定义有枝节点行为，用来存储子部件
 * 容器对象（Composite）
 */
public class ConcreteCompany extends Company {

    private List<Company> companyList = new ArrayList<>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
        companyList.add(company);
    }

    @Override
    public void remove(Company company) {
        companyList.remove(company);
    }

    @Override
    public void display(int depth) {
        // 输出树形结构
        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }

        System.out.println(name);

        // 下级遍历
        for (Company company : companyList) {
            company.display(depth + 1);
        }
    }

    @Override
    public void duty() {
        // 下级遍历
        for (Company company : companyList) {
            company.duty();
        }
    }
}
