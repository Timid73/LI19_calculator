package com.simbirsoft.calculator.core;

public class PlusOperation implements Operation {

    public final static String SYMBOL = "+";

    public int execute(int a, int b) {
        return a + b;
    }
}
