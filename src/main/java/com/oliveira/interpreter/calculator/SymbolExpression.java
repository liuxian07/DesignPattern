package com.oliveira.interpreter.calculator;

/**
 * 解释器模式-运算符解释器
 * 非终结符表达式（Nonterminal Expression）角色
 */
public abstract class SymbolExpression extends Expression {

    // 左侧表达式
    protected Expression left;

    // 右侧表达式
    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        return 0;
    }
}
