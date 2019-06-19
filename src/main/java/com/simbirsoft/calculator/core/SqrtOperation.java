package com.simbirsoft.calculator.core;

public class SqrtOperation implements Operation {

    public final static String SYMBOL = "sqrt";

    public int execute(int a, int b) {
        if(b == 0) {
            throw new ArithmeticException();
        }
        return (int)Math.pow(a, 1/(double)b);
    }
}
