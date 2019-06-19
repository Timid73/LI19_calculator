package com.simbirsoft.calculator.core;

import java.util.HashMap;
import java.util.Map;

import com.simbirsoft.calculator.exception.NotFoundOperationException;

public class Calculator {

    private Map<String, Operation> operations;
    private Map<String, SingleOperations> single_operations;
    public Calculator() {
        operations = new HashMap<String, Operation>();
        operations.put(PlusOperation.SYMBOL, new PlusOperation());
        operations.put(MaxOperation.SYMBOL, new MaxOperation());
        single_operations = new HashMap<String, SingleOperations>();
        single_operations.put(SinOperation.SYMBOL, new SinOperation());
    }

    public int executeOperation(int a, String symbol, int b) {
        Operation operation = operations.get(symbol);
        if (operation != null) {
            return operation.execute(a, b);
        }
        throw new NotFoundOperationException(symbol);
    }

    public double executeOperation(double a, String symbol) {
        SingleOperations operation = single_operations.get(symbol);
        if (operation != null) {
            return operation.execute(a);
        }
        throw new NotFoundOperationException(symbol);
    }
}
