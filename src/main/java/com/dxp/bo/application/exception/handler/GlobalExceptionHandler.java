package com.dxp.bo.application.exception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseStatus(code= HttpStatus.BAD_REQUEST)
    public ResponseEntity<ErrorResponse> handle(Exception ex){
        ErrorResponse errorResponse = new ErrorResponse(ex.getMessage(), HttpStatus.BAD_REQUEST.value());
        ResponseEntity<ErrorResponse> response = new ResponseEntity<ErrorResponse>(errorResponse, HttpStatus.BAD_REQUEST);
        return response;
    }
}
