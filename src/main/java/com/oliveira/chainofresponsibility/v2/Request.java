package com.oliveira.chainofresponsibility.v2;

/**
 * 责任链模式-请求
 */
public class Request {
    private String msg;

    public Request(String msg) {
        this.msg = msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}