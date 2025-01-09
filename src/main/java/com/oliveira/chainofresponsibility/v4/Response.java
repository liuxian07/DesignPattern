package com.oliveira.chainofresponsibility.v4;

/**
 * 责任链模式-响应-双向
 */
public class Response {
    private String msg;

    public Response(String msg) {
        this.msg = msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
