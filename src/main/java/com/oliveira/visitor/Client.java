package com.oliveira.visitor;

/**
 * 访问者模式-客户端
 */
public class Client {

    public static void main(String[] args) {
        // CEO查看绩效
        BusinessReport report = new BusinessReport();
        System.out.println("CEO查看绩效：");
        report.showReport(new CEOVisitor());

        // CTO查看绩效
        System.out.println("=======================================");
        System.out.println("CTO查看绩效：");
        report.showReport(new CTOVisitor());
    }
}
