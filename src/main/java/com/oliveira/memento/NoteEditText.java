package com.oliveira.memento;

/**
 * 备忘录模式-备忘录-负责创建备忘录
 */
public class NoteEditText {

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        System.out.println("写入的内容是：" + content);
    }

    /**
     * 创建一个备忘录，这里对备忘录的创建进行了封装，外部用户不需要知道备忘录的创建细节
     *
     * @return
     */
    public Memento createMemento() {
        return new Memento(content);
    }

    /**
     * 恢复备忘录
     *
     * @param memento
     */
    public void restoreMemento(Memento memento) {
        this.content = memento.getContent();
        System.out.println("恢复的内容是：" + content);
    }
}
