package com.ksg.openapi.common.code;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.apache.ibatis.type.Alias;

/**
 * Created by 강성근
 */
@Alias("HobbyCode")
@Getter
@AllArgsConstructor
public enum HobbyCode implements EnumCode {

    WORK("1", "Work"),
    GAME("2", "Game"),
    STUDY("3", "Study");

    private String code;

    @JsonValue
    private String value;
}
