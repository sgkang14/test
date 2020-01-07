package com.ksg.openapi.sample.errorResponse;

import com.fasterxml.jackson.annotation.JsonValue;
import com.ksg.openapi.handler.CodeEnumHandler;
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
public enum SexType implements CodeEnum {

    MAN("1", "Man"),
    WOMAN("2", "Woman");

    private String code;

    @JsonValue
    private String value;

    @Component
    public static class stringToSexTypeConverter implements Converter<String, SexType> {
        @Override
        public SexType convert(String source){
            return SexType.valueOf(source.toUpperCase());
        }
    }

    @Component
    public static class stringToSexTypeListConverter implements Converter<String, List<SexType>> {
        @Override
        public List<SexType> convert(String source){
            List<String> stringList = Arrays.asList(source.split("\\s*,\\s*"));
            List<SexType> target = new ArrayList<SexType>();
            for (String s: stringList) {
                target.add(SexType.valueOf(s.toUpperCase()));
            }
            return target;
        }
    }

    @MappedTypes(SexType.class)
    @Component
    public static class SexTypeHandler extends CodeEnumHandler<SexType> {
        public SexTypeHandler() {
            super(SexType.class);
        }
    }
}

