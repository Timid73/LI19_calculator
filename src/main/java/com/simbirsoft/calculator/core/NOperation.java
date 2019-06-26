package com.simbirsoft.calculator.core;

import java.util.stream.IntStream;

public class NOperation implements Operation {

    public final static String SYMBOL = "n";

    public int execute(int a, int b) {
        return IntStream.rangeClosed(2, a).reduce(1, (x, y) -> x * y);
    }
}
