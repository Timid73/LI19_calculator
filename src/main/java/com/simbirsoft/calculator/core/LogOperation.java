package com.simbirsoft.calculator.core;

public class LogOperation implements Operation {
    @Override
    public int execute(int a, int b) {
        return (int)(Math.log(a)/Math.log(b));
    }
}
