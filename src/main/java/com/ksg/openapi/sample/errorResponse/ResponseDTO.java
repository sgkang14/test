package com.ksg.openapi.sample.errorResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by 강성근
 */
@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseDTO<T> {

    static final String STATUS_OK = "OK";
    static final String STATUS_FAIL = "Fail";

    private String status;

    private Error error;

    private T data;

    public ResponseDTO(ErrorCode errorCode) {
        this.status = STATUS_FAIL;
        this.error = new Error(errorCode);
    }

    public ResponseDTO(T data) {
        this.status = STATUS_OK;
        this.data = data;
    }

}
