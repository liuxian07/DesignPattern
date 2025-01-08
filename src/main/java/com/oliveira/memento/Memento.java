package com.oliveira.memento;

/**
 * 备忘录模式-备忘录
 */
public class Memento {

    private String content;

    public Memento(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
