package com.ksg.openapi.sample.errorResponse;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by 강성근
 */
@Getter
@AllArgsConstructor
public enum SexType implements CodeEnum {

    MAN("1", "MAN"),
    WOMAN("2", "WOMAN");

    private String code;

    private String name;

}

