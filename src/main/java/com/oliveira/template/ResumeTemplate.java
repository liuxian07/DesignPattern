package com.oliveira.template;

/**
 * 模板方法模式-简历模板
 */
public abstract class ResumeTemplate {

    public final void writeResume() {
        this.writeName();

        this.writeSex();

        System.out.println("写入其他信息");
    }

    // 抽象方法，由子类实现
    protected abstract void writeName();

    // 抽象方法，由子类实现
    protected abstract void writeSex();
}
