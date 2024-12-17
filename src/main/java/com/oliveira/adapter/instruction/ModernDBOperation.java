package com.oliveira.adapter.instruction;

// Java 8+ 方式 - 使用default方法
public interface ModernDBOperation {
    default void connect() { }
    default void query() { }
    default void insert() { }
    default void update() { }
    default void delete() { }
    default void close() { }
}

