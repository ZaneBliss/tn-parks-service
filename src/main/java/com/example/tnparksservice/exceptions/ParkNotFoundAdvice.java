package com.example.tnparksservice.exceptions;

import com.example.tnparksservice.exceptions.ParkNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ParkNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(ParkNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String parkNotFoundHandler(ParkNotFoundException ex) {
        return ex.getMessage();
    }
}
