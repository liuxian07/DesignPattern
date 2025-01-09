package com.oliveira.chainofresponsibility.v2;

/**
 * 责任链模式-客户端
 */
public class Client {
    public static void main(String[] args) {
        Request request = new Request("我是黑客，<script>我是黑客</script>，996");

        MsgProcessor msgProcessor = new MsgProcessor();

        // 添加多个过滤器
        msgProcessor.addFilter(new HtmlFilter());
        msgProcessor.addFilter(new SensitiveFilter());

        msgProcessor.doFilter(request);
        String msg = request.getMsg();
        System.out.println("过滤之后的消息为：" + msg);
    }
}
