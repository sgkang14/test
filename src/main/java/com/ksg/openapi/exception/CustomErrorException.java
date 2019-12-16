package com.ksg.openapi.exception;

import com.ksg.openapi.common.ErrorCode;

/**
 * Created by 강성근
 */
public class CustomErrorException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    ErrorCode errorCode;

    public CustomErrorException() {
        super();
    }

    public CustomErrorException(ErrorCode errorCode) {
        super();
        this.errorCode = errorCode;
    }
}
