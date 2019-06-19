package com.simbirsoft.calculator.core;

public class CtgOperation implements Operation {
    public final static String SYMBOL = "ctg";

    public int execute(int a, int b) {
        return (int)(Math.cos(a) / Math.sin(a));
    }
}
