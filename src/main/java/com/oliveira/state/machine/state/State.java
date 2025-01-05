package com.oliveira.state.machine.state;


/**
 * 状态模式-自动售货机demo-状态模式
 */
public interface State {

    void insertMoney(VendingMachine vendingMachine, int amount);

    void selectProduct(VendingMachine vendingMachine);
}
