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

    public Error(ErrorCode errorCode) {
        this.code = errorCode.getCode();
        this.message = errorCode.getMessage();
    }
}
