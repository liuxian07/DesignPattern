package com.oliveira.chainofresponsibility.v4;

/**
 * 责任链模式-客户端-双向
 * 例如：Servlet中的FilterChain就是双向的，既可以处理请求，也可以处理响应
 * 顺序如下：
 * 1. 正向：HtmlFilter -> SensitiveFilter -> FaceFilter
 * 2. 反向：FaceFilter -> SensitiveFilter -> HtmlFilter
 */
public class Client {

    public static void main(String[] args) {
        // 创建请求
        Request request = new Request("我是黑客，<script>我是黑客</script>，996，:)");
        // 创建响应
        Response response = new Response("我是响应, :)");

        // 创建过滤器链
        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new HtmlFilter());
        filterChain.addFilter(new SensitiveFilter());

        // 创建过滤器链2
        FilterChain filterChain2 = new FilterChain();
        filterChain2.addFilter(new FaceFilter());


        // 因为FilterChain实现了Filter接口，所以可以添加 一个带【责任链】的责任器
        filterChain.addFilter(filterChain2);

        // 去掉了MsgProcessor类，直接调用FilterChain的doFilter方法
        filterChain.doFilter(request, response, filterChain);

        String msg = request.getMsg();
        String msg1 = response.getMsg();
        System.out.println(msg);
        System.out.println(msg1);

    }
}
