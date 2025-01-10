package com.oliveira.interpreter.calculator;

/**
 * 解释器模式-数值解释器
 * 终结符表达式（Terminal Expression）角色
 */
public class ValueExpression extends Expression {

    private int value;

    public ValueExpression() {
    }

    public ValueExpression(int value) {
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    @Override
    public int interpret() {
        return this.value;
    }
}
