package com.springboot.cruddemo.exception;

public class EmployeeServiceException extends RuntimeException {

    private static final long serialVersionUID = 1L;
    private String errorMessage;

    public String getErrorMessage() {
        return errorMessage;
    }

    public EmployeeServiceException(String errorMessage) {
        super(errorMessage);
        this.errorMessage = errorMessage;
    }

    public EmployeeServiceException() {
        super();
    }
}
