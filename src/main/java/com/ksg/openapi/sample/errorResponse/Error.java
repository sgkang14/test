package com.ksg.openapi.sample.errorResponse;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by 강성근
 */
public class Error {

    private String code;

    private String message;

    public Error(ErrorCode errorCode) {
        this.message = ErrorCode.valueOf(errorCode.getName()).getCode();
        this.message = ErrorCode.valueOf(errorCode.getName()).getMessage();
    }
}
