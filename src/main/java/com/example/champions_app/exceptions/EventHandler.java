package com.example.champions_app.exceptions;

import com.example.champions_app.ChampionNotFound;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class EventHandler {
    @ExceptionHandler({ChampionNotFound.class})
    public ResponseEntity<String> handleChampionNotFound(ExceptionEvent e) {
        return ResponseEntity.status(e.getHttpStatus())
                .body(e.getErrorCode());
    }
}
