package com.simbirsoft.calculator.core;

public class SqrtOperation implements Operation {

    public final static String SYMBOL = "sqrt";

    public int execute(int a, int b) {
        return (int) Math.sqrt(a);
    }
}
