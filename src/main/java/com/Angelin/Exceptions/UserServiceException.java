package com.Angelin.Exceptions;


public class UserServiceException extends RuntimeException {
    private String errorCode;

    public UserServiceException(String message, String codeError) {
        super(message);
        this.errorCode = codeError;
    }

    public String getErrorCode() {
        return errorCode;
    }

}