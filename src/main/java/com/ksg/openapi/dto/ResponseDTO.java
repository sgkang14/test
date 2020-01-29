package com.ksg.openapi.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.ksg.openapi.common.code.ErrorCode;
import lombok.*;

/**
 * Created by 강성근
 */
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
public class ResponseDTO<T> {

    @JsonIgnore
    static final String STATUS_OK = "OK";
    @JsonIgnore
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

    @Override
    public String toString() {
        try {
            return new com.fasterxml.jackson.databind.ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(this);
        } catch (com.fasterxml.jackson.core.JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
