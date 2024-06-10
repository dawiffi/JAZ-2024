package com.example.champions_app.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.BAD_REQUEST, reason="Bad champion damage type")
public class BadChampionDamageTypeException extends RuntimeException{
    public BadChampionDamageTypeException() {
    }

    public BadChampionDamageTypeException(String message) {
        super(message);
    }
}
