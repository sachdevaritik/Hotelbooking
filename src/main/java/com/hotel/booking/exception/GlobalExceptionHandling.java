package com.hotel.booking.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandling {
    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<ErrorInfo> runUserNotFoundException(UserNotFoundException ex){
        ErrorInfo er = new ErrorInfo();
        er.setErrCode(HttpStatus.NOT_FOUND.value());
        er.setErrMsg(ex.getMessage());
        er.setErrTimestamp(LocalDateTime.now());

        return new ResponseEntity<>(er, HttpStatus.NOT_FOUND);
    }
}
