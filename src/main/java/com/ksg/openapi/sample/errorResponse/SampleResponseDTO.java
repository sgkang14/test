package com.ksg.openapi.sample.errorResponse;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by 강성근
 */
@Getter
@Setter
public class SampleResponseDTO<T> {

    static final String STATUS_OK = "OK";
    static final String STATUS_FAIL = "Fail";

    private String status;

    private Error error;

    private T data;

    public SampleResponseDTO(ErrorCode errorCode) {
        this.status = STATUS_FAIL;
        this.error = new Error(errorCode);
    }

    public SampleResponseDTO(T data) {
        this.status = STATUS_OK;
        this.data = data;
    }

}
