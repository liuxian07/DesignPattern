package com.oliveira.memento;

/**
 * 备忘录模式-客户端
 * 备忘录模式是一种行为设计模式，它允许在不暴露对象实现细节的情况下保存和恢复对象之前的状态。
 * 备忘录模式的核心是备忘录类，它存储原始对象的状态，并且可以在以后的某个时间点将其恢复。
 */
public class Client {

    public static void main(String[] args) {
        // 定义记事本，并未直接操作Memento对象
        NoteEditText noteEditText = new NoteEditText();

        // 负责存储记事本的对象
        NoteCaretaker noteCaretaker = new NoteCaretaker();

        // 写记事本
        noteEditText.setContent("第一行");
        noteCaretaker.saveMemento(noteEditText.createMemento());

        // 继续写
        noteEditText.setContent("第二行");
        noteCaretaker.saveMemento(noteEditText.createMemento());

        // 写错了，恢复到上一次
        noteEditText.restoreMemento(noteCaretaker.getPrevMemento());
        System.out.println("当前内容是：" + noteEditText.getContent());
    }
}
