package com.oliveira.adapter.instruction;

// 适配器方式 - 通过抽象类提供默认实现
public abstract class DBAdapter implements DBOperation {
    // 提供所有方法的默认实现
    public void connect() { }
    public void query() { }
    public void insert() { }
    public void update() { }
    public void delete() { }
    public void close() { }
}


