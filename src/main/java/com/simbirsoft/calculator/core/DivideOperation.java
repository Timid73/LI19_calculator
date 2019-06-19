package com.simbirsoft.calculator.core;

public class DivideOperation implements Operation {
    public final static String SYMBOL = "/";

    public int execute(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }
}
