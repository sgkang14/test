package com.ksg.openapi.common.code;

import com.fasterxml.jackson.annotation.JsonValue;
import com.ksg.openapi.repository.handler.EnumCodeTypeHandler;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.apache.ibatis.type.MappedTypes;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.lang.Enum;

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
