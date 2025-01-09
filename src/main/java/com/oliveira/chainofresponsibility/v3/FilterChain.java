package com.oliveira.chainofresponsibility.v3;

import java.util.ArrayList;
import java.util.List;

/**
 * 责任链模式-过滤器链-升级版本
 * 支持添加多个过滤链(并非过滤器)
 * 1. 添加一个addFilterChain()方法，调用addAll()方法添加多个过滤器
 * 2. 将FilterChain类中实现Filter接口，那么FilterChain类就是一个过滤器、过滤链。那么addFilter()方法就是添加一个带"过滤链"的过滤器
 */
public class FilterChain implements Filter {
    private List<Filter> filters = new ArrayList<>();


    /**
     * 添加过滤器
     */
    public void addFilter(Filter filter) {
        filters.add(filter);
    }

    /**
     * doFilter()方法，遍历所有过滤器，执行doFilter()方法
     */
    public void doFilter(Request request) {
        for (Filter filter : filters) {
            filter.doFilter(request);
        }
    }

}
