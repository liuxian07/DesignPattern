package com.oliveira.state.machine.state;

/**
 * 状态模式-自动售货机demo-状态模式
 * 无钱状态
 */
public class NoMoneyState implements State {

    @Override
    public void insertMoney(VendingMachine vendingMachine, int amount) {
        // 投币成功
        vendingMachine.setMoney(vendingMachine.getMoney() + amount);
        System.out.println("投币成功，当前余额为：" + vendingMachine.getMoney() + "元");
        // 切换状态为有钱状态
        vendingMachine.setState(new HasMoneyState());
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine) {
        // 无钱状态下，不能购买商品
        System.out.println("请先投币");
    }
}
