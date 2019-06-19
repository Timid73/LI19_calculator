package com.simbirsoft.calculator.core;

public class FactorialOperation implements Operation {

    public final static String SYMBOL = "!";

    public int execute(int a, int b) {
        return factorial(a);
    }

    private int factorial(int a) {
        int p = 1;
        for (int i = a; i > 1; i--) {
            p *= i;
        }
        return p;
    }
}
