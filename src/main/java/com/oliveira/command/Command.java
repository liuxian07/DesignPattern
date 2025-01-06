package com.oliveira.command;

/**
 * 命令模式-命令抽象类
 */
public abstract class Command {

    protected Barbecuer barbecuer;

    public Command(Barbecuer barbecuer) {
        this.barbecuer = barbecuer;
    }

    /**
     * 执行命令
     */
    public abstract void executeCommand();
}
