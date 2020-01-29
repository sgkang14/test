package com.ksg.openapi.common.code;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by 강성근
 */
@Getter
@AllArgsConstructor
public enum SexCode implements EnumCode {

    MAN("1", "Man"),
    WOMAN("2", "Woman");

    private String code;

    @JsonValue
    private String value;
}
