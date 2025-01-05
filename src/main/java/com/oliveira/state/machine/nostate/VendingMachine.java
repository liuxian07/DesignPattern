package com.oliveira.state.machine.nostate;

/**
 * 状态模式-自动售货机demo-无状态模式
 * 无状态模式下，每个方法都需要判断当前状态，导致代码冗余
 */
public class VendingMachine {

    private int money = 0;

    public void insertMoney(int amount) {
        if (money == 0) {
            money += amount;
            System.out.println("成功投币" + amount + "元");
        } else {
            System.out.println("已经有钱了，无需再投币");
        }
    }

    public void selectProduct() {
        if (money == 0) {
            System.out.println("请先投币");
        } else if (money < 10) {
            System.out.println("金额不足，请继续投币");
        } else {
            System.out.println("成功购买商品");
            money = 0;
        }
    }
}
