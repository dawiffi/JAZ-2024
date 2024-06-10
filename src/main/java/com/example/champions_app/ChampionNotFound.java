package com.example.champions_app;

import org.springframework.http.HttpStatus;
import com.example.champions_app.exceptions.ExceptionEvent;

public class ChampionNotFound extends ExceptionEvent {
    public ChampionNotFound(String message) {
        super(message);
    }

    @Override
    protected HttpStatus getHttpStatus() {
        return HttpStatus.NOT_FOUND;
    }

    @Override
    protected String getErrorCode() {
        return "Champion could not be found";
    }
}
