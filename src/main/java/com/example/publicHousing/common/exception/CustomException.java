package com.example.publicHousing.common.exception;

import lombok.Getter;

@Getter
public class CustomException extends RuntimeException {
    private final ExceptionInterface exceptionInterface;

    public CustomException(ExceptionInterface e) {
        super(e.getMessage());
        this.exceptionInterface = e;
    }

    public CustomException(ExceptionInterface e, String message) {
        super(e.getMessage() + message);
        this.exceptionInterface = e;
    }
}
