package com.oliveira.adapter.introduction;

/**
 * <>* java8接口默认方法</>
 */
interface InterfaceA {

    default public void otherPrint()       // 带方法体的默认方法
    {
        System.out.println("print default1 methods InterfaceA!");
    }
}
