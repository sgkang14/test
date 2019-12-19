package com.ksg.openapi.sample.errorResponse;

import org.springframework.core.convert.converter.Converter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 강성근
 */
public class HobbyTypeListConverter implements Converter<String, List<HobbyType>> {
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
