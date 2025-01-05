package com.oliveira.state.machine.state;

/**
 * 状态模式-自动售货机demo-状态模式
 * 有钱状态
 */
public class HasMoneyState implements State {


    @Override
    public void insertMoney(VendingMachine vendingMachine, int amount) {
        // 有钱模式可以不需要再投币
        System.out.println("已经有钱了，无需再投币");
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine) {
        if (vendingMachine.getMoney() < 10) {
            System.out.println("金额不足，请继续投币");
        } else {
            System.out.println("成功购买商品");
            vendingMachine.setMoney(0);
            vendingMachine.setState(new NoMoneyState());
        }
    }
}
