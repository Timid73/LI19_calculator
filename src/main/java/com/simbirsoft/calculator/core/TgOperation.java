package com.simbirsoft.calculator.core;

public class TgOperation implements Operation {

    public final static String SYMBOL = "tg";

    public int execute(int a, int b) {
        return (int) Math.tan(a);
    }
}
