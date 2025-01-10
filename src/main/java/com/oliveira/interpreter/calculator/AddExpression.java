package com.oliveira.interpreter.calculator;

/**
 * 解释器模式-加法解释器
 */
public class AddExpression extends SymbolExpression {

    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        // 加法运算
        return left.interpret() + right.interpret();
    }
}
