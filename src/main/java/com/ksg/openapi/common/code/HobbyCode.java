package com.ksg.openapi.common.code;

import com.fasterxml.jackson.annotation.JsonValue;
import com.ksg.openapi.mapper.handler.EnumCodeTypeHandler;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.apache.ibatis.type.MappedTypes;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 강성근
 */
@Getter
@AllArgsConstructor
public enum HobbyCode implements EnumCode {

    WORK("1", "Work"),
    GAME("2", "Game"),
    STUDY("3", "Study");

    private String code;

    @JsonValue
    private String value;

    @Component
    public static class stringToHobbyTypeConverter implements Converter<String, HobbyCode> {
        @Override
        public HobbyCode convert(String source){
            return HobbyCode.valueOf(source.toUpperCase());
        }
    }

    @Component
    public static class stringToHobbyTypeListConverter implements Converter<String, List<HobbyCode>> {
        @Override
        public List<HobbyCode> convert(String source){
            List<String> stringList = Arrays.asList(source.split("\\s*,\\s*"));
            List<HobbyCode> target = new ArrayList<HobbyCode>();
            for (String s: stringList) {
                target.add(HobbyCode.valueOf(s.toUpperCase()));
            }
            return target;
        }
    }

    @MappedTypes(HobbyCode.class)
    @Component
    public static class HobbyCodeTypeHandler extends EnumCodeTypeHandler<HobbyCode> {
        public HobbyCodeTypeHandler() {
            super(HobbyCode.class);
        }
    }
}
