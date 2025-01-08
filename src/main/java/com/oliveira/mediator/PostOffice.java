package com.oliveira.mediator;

/**
 * 中介者模式-抽象中介者
 */
public interface PostOffice {


    /**
     * 送信
     *
     * @param letter   信件内容
     * @param receiver 收信人
     */
    void deliverLetter(String letter, String receiver);


    void addPeople(People people);
}
