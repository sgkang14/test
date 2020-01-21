package com.ksg.openapi.common.exception;

import com.ksg.openapi.common.code.ErrorCode;
import lombok.Getter;

/**
 * Created by 강성근
 */
@Getter
public class CustomErrorException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private ErrorCode errorCode;

    private CustomErrorException() {}

    public CustomErrorException(ErrorCode errorCode) {
        super();
        this.errorCode = errorCode;
    }

    public CustomErrorException(ErrorCode errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }
}
