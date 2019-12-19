package com.ksg.openapi.sample.errorResponse;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by 강성근
 */
@Getter
@AllArgsConstructor
public enum HobbyType {

    GAME("100", "GAME"),
    NOVEL("200", "NOVEL");

    private String code;

    private String name;
}
