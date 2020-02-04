package com.ksg.openapi.dto;

import com.ksg.openapi.common.code.ErrorCode;
import lombok.Getter;

/**
 * Created by 강성근
 */
@Getter
public class Error {

    private String code;

    private String message;

    public Error(ErrorCode errorCode, String cause) {
        this.code = errorCode.getCode();
        this.message = errorCode.getMessage();
        if (cause != null) {
            this.message = this.message + "(" + cause + ")";
        }
    }

    public Error(ErrorCode errorCode) {
        this(errorCode, null);
    }
}
