package com.simbirsoft.calculator.core;

public interface SingleOperations{
    default double execute(double a) {
        return 0;
    }
}
