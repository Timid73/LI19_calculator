package com.simbirsoft.calculator.exception;

public class NotFoundOperationException extends RuntimeException {

    public NotFoundOperationException(String symbol) {
        super(String.format("Operation [%s] not found", symbol));
    }
}
