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
public enum SexCode implements EnumCode {

    MAN("1", "Man"),
    WOMAN("2", "Woman");

    private String code;

    @JsonValue
    private String value;

    @Component
    public static class stringToSexTypeConverter implements Converter<String, SexCode> {
        @Override
        public SexCode convert(String source){
            return SexCode.valueOf(source.toUpperCase());
        }
    }

    @Component
    public static class stringToSexTypeListConverter implements Converter<String, List<SexCode>> {
        @Override
        public List<SexCode> convert(String source){
            List<String> stringList = Arrays.asList(source.split("\\s*,\\s*"));
            List<SexCode> target = new ArrayList<SexCode>();
            for (String s: stringList) {
                target.add(SexCode.valueOf(s.toUpperCase()));
            }
            return target;
        }
    }

    @MappedTypes(SexCode.class)
    @Component
    public static class SexCodeTypeHandler extends EnumCodeTypeHandler<SexCode> {
        public SexCodeTypeHandler() {
            super(SexCode.class);
        }
    }
}
