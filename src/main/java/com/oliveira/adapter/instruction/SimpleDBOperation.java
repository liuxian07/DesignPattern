package com.oliveira.adapter.instruction;

// 传统方式 - 必须实现所有方法
public class SimpleDBOperation implements DBOperation {
    // 不得不实现所有方法，即使有些方法用不到
    @Override
    public void connect() { }

    @Override
    public void query() { }

    @Override
    public void insert() { }

    @Override
    public void update() { }

    @Override
    public void delete() { }

    @Override
    public void close() { }
}