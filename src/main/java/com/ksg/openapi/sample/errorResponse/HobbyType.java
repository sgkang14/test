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

    public static class StringToEnum implements Converter<String, HobbyType> {
        @Override
        public HobbyType convert(String source) {
            return HobbyType.valueOf(source.toUpperCase());
        }
    }

    public static class StringToListEnum implements Converter<String, List<HobbyType>> {
        @Override
        public List<HobbyType> convert(String source) {
            List<String> sourceList = Arrays.asList(source.split("\\s*,\\s*"));
            List<HobbyType> targetList = new ArrayList<HobbyType>();
            for (String item : sourceList) {
                targetList.add(HobbyType.valueOf(item.toUpperCase()));
            }
            return targetList;
        }
    }
}
