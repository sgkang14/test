package com.ksg.openapi.sample.errorResponse;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 강성근
 */
@Getter
@AllArgsConstructor
public enum SexType implements EnumCode {

    MAN("1", "MAN"),
    WOMAN("2", "WOMAN");

    private String code;

    private String name;

}

