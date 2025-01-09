package com.oliveira.chainofresponsibility.v2;

/**
 * 责任链模式-过滤器接口
 * 抽象处理者（Handler）
 */
public interface Filter {

    void doFilter(Request request);
}
