package com.oliveira.chainofresponsibility.v3;

/**
 * 责任链模式-过滤器接口-升级版本
 * 抽象处理者（Handler）
 */
public interface Filter {

    void doFilter(Request request);
}
