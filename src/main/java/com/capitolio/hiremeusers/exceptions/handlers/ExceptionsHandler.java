package com.capitolio.hiremeusers.exceptions.handlers;

import com.capitolio.hiremeusers.exceptions.UserNotFoundByIdException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionsHandler {

    @ExceptionHandler
    public ResponseEntity<Void> handle(UserNotFoundByIdException exception){
        return ResponseEntity.notFound().build();
    }

}
