package com.example.champions_app.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Champion not found")
public class ChampionNotFoundException extends RuntimeException{
    public ChampionNotFoundException() {
    }

    public ChampionNotFoundException(String message) {
        super(message);
    }
}
