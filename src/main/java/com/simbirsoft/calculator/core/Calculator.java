package com.simbirsoft.calculator.core;

import java.util.HashMap;
import java.util.Map;

import com.simbirsoft.calculator.exception.NotFoundOperationException;

public class Calculator {

    private Map<String, Operation> operations;

    public Calculator() {
        operations = new HashMap<String, Operation>();
        operations.put(PlusOperation.SYMBOL, new PlusOperation());
        operations.put(MinusOperation.SYMBOL, new PlusOperation());
        operations.put(MultiplyOperation.SYMBOL, new PlusOperation());
        operations.put(DivideOperation.SYMBOL, new PlusOperation());
        operations.put(PowerOperation.SYMBOL, new PlusOperation());
        operations.put(MaxOperation.SYMBOL, new PlusOperation());
        operations.put(MinOperation.SYMBOL, new PlusOperation());
        operations.put(LogOperation.SYMBOL, new PlusOperation());
        operations.put(TgOperation.SYMBOL, new PlusOperation());
        operations.put(CtgOperation.SYMBOL, new PlusOperation());
        operations.put(NOperation.SYMBOL, new PlusOperation());
        operations.put(USDRUBOperation.SYMBOL, new PlusOperation());
        operations.put(SqrtOperation.SYMBOL, new PlusOperation());
        operations.put(CosOperation.SYMBOL, new PlusOperation());
        operations.put(SinOperation.SYMBOL, new PlusOperation());

    }

    public int executeOperation(int a, String symbol, int b) {
        Operation operation = operations.get(symbol);
        if (operation != null) {
            return operation.execute(a, b);
        }
        throw new NotFoundOperationException(symbol);
    }
}
