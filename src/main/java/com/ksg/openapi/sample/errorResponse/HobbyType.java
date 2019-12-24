package com.ksg.openapi.sample.errorResponse;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.core.convert.converter.Converter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 강성근
 */
@Getter
@AllArgsConstructor
public enum HobbyType implements EnumCode {

    GAME("100", "GAME"),
    NOVEL("200", "NOVEL");

    private String code;

    private String name;

}
