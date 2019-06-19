package com.simbirsoft.calculator.core;

public class CosOperation implements Operation {
    @Override
    public int execute(int a, int b) {
        return (int)Math.cos(a);
    }
}
