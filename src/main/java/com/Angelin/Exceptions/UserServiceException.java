package com.Angelin.Exceptions;

public class UserServiceException extends RuntimeException {
        private final String errorCode;

        public UserServiceException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
