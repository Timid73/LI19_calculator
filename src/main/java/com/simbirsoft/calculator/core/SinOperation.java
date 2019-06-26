package com.simbirsoft.calculator.core;

public class SinOperation implements Operation {

    public final static String SYMBOL = "sin";

    public int execute(int a, int b) {
        return (int) Math.sin(a);
    }
}
