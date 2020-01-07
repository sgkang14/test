package com.ksg.openapi.sample.errorResponse;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

/**
 * Created by 강성근
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum ErrorCode {

    NOT_FOUND_PARAM("1400", "NOT_FOUND_PARAM", "abc", HttpStatus.BAD_REQUEST),
    INVALID_PARAM("2400", "INVALID_PARAM", "bcd", HttpStatus.BAD_REQUEST),
    NOT_FOUND("1404", "NOT_FOUND", "cde", HttpStatus.BAD_REQUEST),
    INTERNAL_SERVER_ERROR("1500", "INTERNAL_SERVER_ERROR", "def", HttpStatus.BAD_REQUEST);

    private String code;

    private String name;

    private String message;

    private HttpStatus httpStatus;
}
