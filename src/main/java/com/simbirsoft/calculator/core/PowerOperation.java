package com.simbirsoft.calculator.core;

public class PowerOperation implements Operation {

    public final static String SYMBOL = "^";

    public int execute(int a, int b) {
        return (int) Math.pow(a, b);
    }
}
