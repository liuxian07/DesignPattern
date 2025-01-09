package com.oliveira.chainofresponsibility.v2;

/**
 * 责任链模式-过滤器
 * 具体的处理者
 */
public class SensitiveFilter implements Filter {

    @Override
    public void doFilter(Request request) {
        // 获取非法字符
        String msg = request.getMsg();
        msg = msg.replaceAll("996", "955");
        request.setMsg(msg);
    }
}
