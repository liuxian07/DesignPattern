package com.oliveira.interpreter.calculator;

/**
 * 解释器模式-计算器类
 */
public class Calculator {

    public int calculate(String statement) {

        Expression left;
        Expression right;

        // 定义用于存储已经计算的值
        Expression now = null;

        String[] str = statement.split(" ");
        for (int i = 0; i < str.length; i++) {
            if ("+".equals(str[i])) {
                // 左边对象已经计算过值
                left = now;
                // 右边对象是数值 ++i,因为i是运算符
                right = new ValueExpression(Integer.valueOf(str[++i]));
                // 计算加法
                now = new AddExpression(left, right);
            } else if ("-".equals(str[i])) {
                // 左边对象已经计算过值
                left = now;
                // 右边对象是数值 ++i,因为i是运算符
                right = new ValueExpression(Integer.valueOf(str[++i]));
                // 计算减法
                now = new SubExpression(left, right);
            } else {
                // 数值，第一个值和最后一个值一定是数值
                now = new ValueExpression(Integer.valueOf(str[i]));
            }
        }
        return now.interpret();
    }
}
