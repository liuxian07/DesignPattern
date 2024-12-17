package com.oliveira.adapter.instruction;


/**
 * 直接实现接口，只覆盖需要的方法
 *
 */
class ReadOnlyModernDB implements ModernDBOperation {
    // 补充：接口类继承
    // 1. 如果是一个子接口，可以扩展父接口的方法
    // 2. 如果是一个子抽象类，可以部分或全部实现父抽象类的方法
    // 3. 如果是子类不是抽象类，则要求子类一定要实现父接口的所有方法
    // 那么现在的问题是：若接口中方法定义了default方法，子类是否需要实现？
    // 答案是：不需要，default方法是接口的默认实现，子类可以选择性实现
    @Override
    public void query() {
        System.out.println("只实现查询操作");
    }
}