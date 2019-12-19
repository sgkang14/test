package com.ksg.openapi.backup.common;

import org.springframework.core.convert.converter.Converter;

/**
 * Created by 강성근
 */
/*
public class SexTypeConverter implements Converter<String, HobbyType> {
    @Override
    public HobbyType convert(String source) {
        return HobbyType.valueOf(source.toUpperCase());
    }
}
*/
public class HobbyTypeConverter implements Converter<String, HobbyType> {
    @Override
    public HobbyType convert(String source) {
        return HobbyType.valueOf(source.toUpperCase());
    }
}
