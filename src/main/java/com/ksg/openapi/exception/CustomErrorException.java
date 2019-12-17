package com.ksg.openapi.exception;

import com.ksg.openapi.sample.errorResponse.ErrorCode;
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
}
