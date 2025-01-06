package com.oliveira.template;

/**
 * 模板方法模式-简历模板-张三简历
 */
public class ZhangSanResume extends ResumeTemplate {

    @Override
    protected void writeName() {
        System.out.println("张三");
    }

    @Override
    protected void writeSex() {
        System.out.println("男");
    }
}
