package com.oliveira.chainofresponsibility.v3;

/**
 * 责任链模式-过滤器-升级版本
 * 具体处理者（ConcreteHandler）
 */
public class FaceFilter implements Filter {

    @Override
    public void doFilter(Request request) {
        // 处理字符串中的表情符号
        String msg = request.getMsg();
        msg = msg.replace(":)", "^V^");
        request.setMsg(msg);
    }
}
