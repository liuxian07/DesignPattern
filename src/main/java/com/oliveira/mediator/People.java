package com.oliveira.mediator;

/**
 * 中介者模式-抽象同事类
 */
public abstract class People {

    protected PostOffice postOffice;

    public String getAddress() {
        return address;
    }

    /**
     * 收到信
     */
    public void receiverLetter(String letter) {
        System.out.println(letter);
    }

    /**
     * 发送信
     */
    public void sendLetter(String letter, String receiver) {
        postOffice.deliverLetter(letter, receiver);
    }


    public void setAddress(String address) {
        this.address = address;
    }

    private String address;


    public People(PostOffice postOffice, String address) {
        this.postOffice = postOffice;
        this.address = address;
    }
}
