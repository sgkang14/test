package com.ksg.openapi.sample.errorResponse;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;
import com.ksg.openapi.handler.CodeEnumHandler;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
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
public enum HobbyType implements CodeEnum {

    WORK("1", "Work"),
    GAME("2", "Game"),
    STUDY("3", "Study");

    private String code;

    @JsonValue
    private String value;

    @Component
    public static class stringToHobbyTypeConverter implements Converter<String, HobbyType> {
        @Override
        public HobbyType convert(String source){
            return HobbyType.valueOf(source.toUpperCase());
        }
    }

    @Component
    public static class stringToHobbyTypeListConverter implements Converter<String, List<HobbyType>> {
        @Override
        public List<HobbyType> convert(String source){
            List<String> stringList = Arrays.asList(source.split("\\s*,\\s*"));
            List<HobbyType> target = new ArrayList<HobbyType>();
            for (String s: stringList) {
                target.add(HobbyType.valueOf(s.toUpperCase()));
            }
            return target;
        }
    }

    @MappedTypes(HobbyType.class)
    @Component
    public static class HobbyTypeHandler extends CodeEnumHandler<HobbyType> {
        public HobbyTypeHandler() {
            super(HobbyType.class);
        }
    }
}
