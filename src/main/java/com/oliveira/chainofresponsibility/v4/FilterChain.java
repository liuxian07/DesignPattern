package com.oliveira.chainofresponsibility.v4;

import java.util.ArrayList;
import java.util.List;

/**
 * 责任链模式-过滤器链-双向
 */
public class FilterChain implements Filter {

    private List<Filter> filters = new ArrayList<>();

    private int index = 0;

    public void addFilter(Filter filter) {
        filters.add(filter);
    }

    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        // 若已经执行完所有过滤器，则返回(是递归调用的出口，后续是递归返回)
        if (index == filters.size()) {
            return;
        }
        // 获取当前过滤器
        Filter filter = filters.get(index);
        index++;

        filter.doFilter(request, response, chain);
    }
}
