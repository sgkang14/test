package com.ksg.openapi.sample.errorResponse;

import org.springframework.core.convert.converter.Converter;

/**
 * Created by 강성근
 */

public class EnumTypeConverter implements Converter<String, EnumType> {
    @Override
    public EnumType convert(String source) {
        return EnumType.valueOf(source.toUpperCase());
    }
}
