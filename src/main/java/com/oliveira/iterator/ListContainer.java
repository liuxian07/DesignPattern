package com.oliveira.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 迭代器模式-具体容器
 */
public class ListContainer implements MyContainer {

    private List<Object> list = new ArrayList<>();

    @Override
    public void add(Object obj) {
        list.add(obj);
    }

    @Override
    public void remove(Object obj) {
        list.add(obj);
    }

    @Override
    public MyIterator iterator() {
        return new MyIteratorImpl();
    }

    private class MyIteratorImpl implements MyIterator {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < list.size();
        }

        @Override
        public Object next() {
            return list.get(index++);
        }
    }
}
