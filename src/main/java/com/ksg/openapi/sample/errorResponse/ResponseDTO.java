package com.ksg.openapi.sample.errorResponse;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.sun.org.apache.xml.internal.serializer.SerializerTrace;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.core.serializer.Serializer;

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

    @JsonIgnore
    public ResponseDTO(T data) {
        this.status = STATUS_OK;
        this.data = data;
    }

}
