package com.oliveira.chainofresponsibility.v2;

/**
 * 责任链模式-过滤器
 * 具体的处理者
 */
public class HtmlFilter implements Filter {

    @Override
    public void doFilter(Request request) {
        // 过滤非法字符
        String msg = request.getMsg();
        msg = msg.replaceAll("<", "[");
        msg = msg.replaceAll(">", "]");
        request.setMsg(msg);
    }
}
