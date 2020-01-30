package com.ksg.openapi.support.converter;

import com.ksg.openapi.common.code.SexCode;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 강성근
 */
public class SexCodeConverter {

//    @Component
//    public static class stringToSexTypeConverter implements Converter<String, SexCode> {
//        @Override
//        public SexCode convert(String source){
//            return SexCode.valueOf(source.toUpperCase());
//        }
//    }
/*
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
    */
}
