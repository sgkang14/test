package com.ksg.openapi.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.ksg.openapi.common.code.ErrorCode;
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

    @JsonIgnore
    static final String STATUS_OK = "OK";
    @JsonIgnore
    static final String STATUS_FAIL = "Fail";

    private String status;

    private Error error;

    private T data;

    @JsonIgnore
    public ResponseDTO(ErrorCode errorCode) {
        this.status = STATUS_FAIL;
        this.error = new Error(errorCode);
    }
}
