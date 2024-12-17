package com.oliveira.adapter.introduction;

public class InterfaceDefault {
    public static void main(String[] args) {
        subClass subObj = new subClass();    //实例化子类对象
        subObj.otherPrint();           //调用接口中的默认方法

        InterfaceA InterfaceAobj = new subClass();    // 实例化子类对象，赋值给一个接口引用
        InterfaceAobj.otherPrint();           //调用接口中的默认方法
    }
}
