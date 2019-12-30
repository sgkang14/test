package com.ksg.openapi.sample.errorResponse;

import lombok.AllArgsConstructor;
import lombok.Getter;
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
public enum HobbyType implements EnumCode {

    WORK("1", "WORK"),
    GAME("2", "GAME"),
    STUDY("3", "STUDY");

    private String code;

    private String name;

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
}
