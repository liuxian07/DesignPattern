package com.oliveira.chainofresponsibility.v2;


import java.util.ArrayList;
import java.util.List;

/**
 * 过滤链处理器
 */
public class MsgProcessor {

    private List<Filter> filters = new ArrayList<>();

    /**
     * 添加过滤器
     *
     * @param filter
     */
    public void addFilter(Filter filter) {
        filters.add(filter);
    }

    /**
     * 处理请求
     *
     * @param request
     */
    public void doFilter(Request request) {
        for (Filter filter : filters) {
            filter.doFilter(request);
        }
    }

}
