package com.simbirsoft.calculator.core;

public class CosOperation implements Operation {

    public final static String SYMBOL = "cos";

    public int execute(int a, int b) {
        return (int) Math.cos(a);
    }
}
