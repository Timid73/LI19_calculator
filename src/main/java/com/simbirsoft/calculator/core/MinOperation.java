package com.simbirsoft.calculator.core;

public class MinOperation implements Operation {

    public final static String SYMBOL = "min";

    public int execute(int a, int b) {
        return Math.min(a, b);
    }
}
