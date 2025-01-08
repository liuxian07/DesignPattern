package com.oliveira.iterator;

/**
 * 迭代器模式-客户端-测试类
 */
public class Client {

    public static void main(String[] args) {
        ListContainer listContainer = new ListContainer();
        listContainer.add("张三");
        listContainer.add("李四");

        MyIterator iterator = listContainer.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
