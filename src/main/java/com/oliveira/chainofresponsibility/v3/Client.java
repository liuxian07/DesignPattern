package com.oliveira.chainofresponsibility.v3;

/**
 * 责任链模式-客户端-升级版本
 * 测试FilterChain类，并去掉MsgProcessor类
 */
public class Client {
    public static void main(String[] args) {

        Request request = new Request("我是黑客，<script>我是黑客</script>，996，:)");

        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new HtmlFilter());
        filterChain.addFilter(new SensitiveFilter());

        FilterChain filterChain2 = new FilterChain();
        filterChain2.addFilter(new FaceFilter());

        // 因为FilterChain实现了Filter接口，所以可以添加 一个带【责任链】的责任器
        filterChain.addFilter(filterChain2);

        // 去掉了MsgProcessor类，直接调用FilterChain的doFilter方法
        filterChain.doFilter(request);
        String msg = request.getMsg();
        System.out.println(msg);
    }
}
