package com.oliveira.adapter.instruction;

// 定义数据库操作接口
public interface DBOperation {
    void connect();
    void query();
    void insert();
    void update();
    void delete();
    void close();
}