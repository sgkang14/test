package com.ksg.openapi.common;

import lombok.Getter;

/**
 * Created by 강성근
 */
public enum HobbyType {
    WORK("100"),
    GAME("200"),
    SHOPPING("300");

    @Getter
    private String code;

    HobbyType(String code) {
        this.code = code;
    }
}
