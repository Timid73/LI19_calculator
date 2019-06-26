package com.simbirsoft.calculator.core;

public class USDRUBOperation implements Operation {

    public final static String SYMBOL = "usdrub";

    public int execute(int a, int b) {
        return a / 62;
    }
}
