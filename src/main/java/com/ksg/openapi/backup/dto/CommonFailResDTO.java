package com.ksg.openapi.backup.dto;

import com.ksg.openapi.backup.common.ErrorCode;
import lombok.Getter;

/**
 * Created by 강성근
 */
public class CommonFailResDTO {

    @Getter
    private static final String result = "fail";
    @Getter
    private Error error;

    public CommonFailResDTO(ErrorCode errorCode) {
        error = new Error(errorCode.getCode(), errorCode.getMessage());
    }

    public class Error {

        @Getter
        private int code;
        @Getter
        private String message;

        Error(int code, String message) {
            this.code = code;
            this.message = message;
        }
    }
}