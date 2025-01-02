package com.oliveira.composite.company;

/**
 * 测试类
 * 组织模式
 */
public class Test {

    public static void main(String[] args) {

        // 总公司
        Company headCompany = new ConcreteCompany("北京总公司");

        // 广东华南分公司
        Company southCompany = new ConcreteCompany("广东华南分公司");
        southCompany.add(new HRDepartment("广东华南分公司人力资源部"));
        southCompany.add(new FinanceDepartment("广东华南分公司财务部"));
        headCompany.add(southCompany);

        // 深圳办事处
        Company shenzhenCompany = new ConcreteCompany("深圳办事处");
        shenzhenCompany.add(new HRDepartment("深圳办事处人力资源部"));
        shenzhenCompany.add(new FinanceDepartment("深圳办事处财务部"));
        southCompany.add(shenzhenCompany);

        //组织架构图
        System.out.println("组织架构图：");
        headCompany.display(1);

        //职责
        System.out.println("职责：");
        headCompany.duty();
    }
}
