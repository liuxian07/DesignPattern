package com.oliveira.interpreter.calculator;

/**
 * 解释器模式-客户端-计算器
 */
public class Client {

    public static void main(String[] args) {
        String statement = "1 + 2 + 3";
        Calculator calculator = new Calculator();
        int calculate = calculator.calculate(statement);
        System.out.println(statement + " = " + calculate);

        String statement2 = "3 - 2 + 1";
        int calculate2 = calculator.calculate(statement2);
        System.out.println(statement2 + " = " + calculate2);
    }
}
