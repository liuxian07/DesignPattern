package com.oliveira.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 命令模式-服务员
 */
public class BeautifulWaiter {

    private List<Command> commandList = new ArrayList<>();

    public void addCommand(Command command) {
        commandList.add(command);
    }

    /**
     * 通知厨师开始制作
     */
    public void notifyBarbecuer() {
        for (Command command : commandList) {
            command.executeCommand();
        }
    }
}
