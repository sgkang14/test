package com.ksg.openapi.sample.errorResponse;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by 강성근
 */
@Getter
@AllArgsConstructor
public enum ErrorCode {

    NOT_FOUND_PARAM("1400", "NOT_FOUND_PARAM", "abc", 400),
    INVALID_PARAM("2400", "INVALID_PARAM", "bcd", 400),
    NOT_FOUND("1404", "NOT_FOUND", "cde", 404),
    INTERAL_SERVER_ERROR("1500", "INTERAL_SERVER_ERROR", "def", 500);

    private String code;

    private String name;

    private String message;

    private Integer httpStatus;
}
