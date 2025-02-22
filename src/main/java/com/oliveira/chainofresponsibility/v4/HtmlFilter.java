package com.oliveira.chainofresponsibility.v4;


/**
 * 责任链模式-过滤器-双向
 */
public class HtmlFilter implements Filter {

    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        // 过滤非法字符
        String msg = request.getMsg();
        msg = msg.replaceAll("<", "[");
        msg = msg.replaceAll(">", "]");
        request.setMsg(msg);

        // 执行下一个过滤器。这行代码是双向责任链的核心(可理解为递归调用，所以在response是反向调用)
        chain.doFilter(request, response, chain);

        response.setMsg(response.getMsg() + "--HtmlFilter()");
    }
}
