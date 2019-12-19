package com.ksg.openapi.sample.errorResponse;

import org.springframework.core.convert.converter.Converter;

/**
 * Created by 강성근
 */

public class SexTypeConverter implements Converter<String, SexType> {
    @Override
    public SexType convert(String source) {
        return SexType.valueOf(source.toUpperCase());
    }
}
