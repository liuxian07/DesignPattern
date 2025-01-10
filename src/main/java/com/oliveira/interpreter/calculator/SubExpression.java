package com.oliveira.interpreter.calculator;

/**
 * 解释器模式-减法解释器
 */
public class SubExpression extends SymbolExpression {

    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        // 减法运算
        return left.interpret() - right.interpret();
    }
}
