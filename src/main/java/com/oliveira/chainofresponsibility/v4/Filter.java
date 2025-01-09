package com.oliveira.chainofresponsibility.v4;



/**
 * 责任链模式-过滤器接口-双向
 */
public interface Filter {

    void doFilter(Request request, Response response, FilterChain chain);
}
