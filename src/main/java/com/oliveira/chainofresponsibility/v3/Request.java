package com.oliveira.chainofresponsibility.v3;

/**
 * 责任链模式-请求-升级版本
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
