package com.oliveira.iterator;

/**
 * 抽象容器-抽象聚合接口
 */
public interface MyContainer {

    void add(Object obj);

    void remove(Object obj);

    MyIterator iterator();
}
