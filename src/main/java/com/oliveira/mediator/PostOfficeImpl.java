package com.oliveira.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * 中介者模式-具体中介者-邮局
 */
public class PostOfficeImpl implements PostOffice {

    private Map<String, People> peopleMap = new HashMap<>();

    @Override
    public void deliverLetter(String letter, String receiver) {
        System.out.println("收到信件");
        People people = peopleMap.get(receiver);
        System.out.println("送信，收件人的地址是：" + people.getAddress());
        people.receiverLetter(letter);
    }

    @Override
    public void addPeople(People people) {
        peopleMap.put(people.getAddress(), people);
    }
}
