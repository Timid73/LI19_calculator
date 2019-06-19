package com.simbirsoft.calculator.core;

public class SinOperation implements SingleOperations {
    public final static String SYMBOL = "sin";

    public double execute(double a) {
        return Math.sin(a);
    }
}
