package com.simbirsoft.calculator.core;

public class PowOperation implements Operation {
    public final static String SYMBOL = "pow";

    public int execute(int a, int b) {
        return (int) Math.pow(a, b);
    }
}
