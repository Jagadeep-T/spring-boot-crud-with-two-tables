package com.springboot.cruddemo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(EmployeeServiceException.class)
    public ResponseEntity<String> exceptionEmployeeHandler(Exception ex) {
        return response("Invalid Query", ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    private static String createJson(int code, String message, String reason) {
        return "{\"code\" : \"" + code + "\"," +
                "\"error\" : \"" + message  + "\"," +
                "\"reason\" : \"" + reason  + "\"}";
    }

    public static ResponseEntity<String> response(String message, String reason, HttpStatus httpStatus) {
        String json = createJson(httpStatus.value(), message, reason);
        return new ResponseEntity<>(json, httpStatus);
    }
}
