package com.simbirsoft.calculator;

import com.simbirsoft.calculator.core.Calculator;

public class Main {

    public static void main(String[] args) {
        Calculator testCalc = new Calculator();
        System.out.println(testCalc.executeOperation(2, "+", 3));
        System.out.println(testCalc.executeOperation(5, "n", 3));
        //TODO
    }
}
