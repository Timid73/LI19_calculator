package com.simbirsoft.calculator.core;

public class LogOperation implements Operation {

    public final static String SYMBOL = "log";

    public int execute(int a, int b) {
        return (int) Math.log(a);
    }
}
