package com.oliveira.adapter.instruction;

// 适配器方式 - 通过抽象类提供默认实现 - 只实现查询操作
class ReadOnlyDB extends DBAdapter {
    @Override
    public void query() {
        System.out.println("只实现查询操作");
    }
}