package com.oliveira.state.machine.state;

/**
 * 状态模式-自动售货机demo-状态模式
 */
public class VendingMachine {

    private State state;
    private int money;

    /**
     * 初始化自动售货机状态为无钱状态
     */
    public VendingMachine() {
        this.state = new NoMoneyState();
        this.money = 0;
    }


    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
