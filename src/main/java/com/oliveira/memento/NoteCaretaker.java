package com.oliveira.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * 备忘录模式-备忘录管理者-负责存储备忘录
 */
public class NoteCaretaker {

    /**
     * 备忘录记录
     */
    private List<Memento> mementoList = new ArrayList<>();

    /**
     * 存档位置
     */
    private int index = 0;

    /**
     * 存档
     *
     * @param memento 备忘录
     */
    public void saveMemento(Memento memento) {
        mementoList.add(memento);
        index = mementoList.size() - 1;
    }

    /**
     * 获取上一个备忘录
     */
    public Memento getPrevMemento() {
        return mementoList.get(index > 0 ? --index : index);
    }

    /**
     * 获取下一个备忘录
     */
    public Memento getNextMemento() {
        index = Math.max(index, (mementoList.size() - 1));
        return mementoList.get(index);
    }
}
