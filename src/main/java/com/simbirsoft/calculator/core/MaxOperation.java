package com.simbirsoft.calculator.core;

public class MaxOperation implements Operation {

    public final static String SYMBOL = "max";

    public int execute(int a, int b) {
        return Math.max(a, b);
    }
}
