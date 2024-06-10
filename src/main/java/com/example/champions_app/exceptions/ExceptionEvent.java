package com.example.champions_app.exceptions;

import org.springframework.http.HttpStatus;

public abstract class ExceptionEvent extends RuntimeException{
    protected abstract HttpStatus getHttpStatus();
    protected abstract String getErrorCode();
    public ExceptionEvent(String message) {
        super(message);
    }
}