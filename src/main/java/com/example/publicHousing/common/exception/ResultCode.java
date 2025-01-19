package com.example.publicHousing.common.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ResultCode implements ExceptionInterface {
    SUCCESS(0, "SUCCESS"),

    HOUSE_IS_INVALID(100, "HOUSE_IS_INVALID");

    private final Integer code;
    private final String message;
}
