package com.ksg.openapi.backup.common;

import lombok.Getter;

/**
 * Created by 강성근
 */
public enum ErrorCode {

    NOT_FOUND_PARAM(1400, "NOT_FOUND_PARAM", 400),
    INVALID_PARAM(2400, "INVALID_PARAM", 400),
    NOT_FOUND(1404, "NOT_FOUND", 404),
    INTERAL_SERVER_ERROR(1500, "INTERAL_SERVER_ERROR", 500);

    @Getter
    private int code;

    @Getter
    private String message;

    @Getter
    private int httpStatus;

    ErrorCode(int code, String message, int httpStatus) {
        this.code = code;
        this.message = message;
        this.httpStatus = httpStatus;
    }

}