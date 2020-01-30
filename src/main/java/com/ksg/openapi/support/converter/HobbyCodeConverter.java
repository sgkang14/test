package com.ksg.openapi.support.converter;

import com.ksg.openapi.common.code.HobbyCode;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 강성근
 */
public class HobbyCodeConverter {

//    @Component
//    public static class stringToHobbyCodeConverter implements Converter<String, HobbyCode> {
//        @Override
//        public HobbyCode convert(String source){
//            return HobbyCode.valueOf(source.toUpperCase());
//        }
//    }

    /*
    @Component
    public static class stringToHobbyCodeListConverter implements Converter<String, List<HobbyCode>> {
        @Override
        public List<HobbyCode> convert(String source){
            List<String> stringList = Arrays.asList(source.split("\\s*,\\s*"));
            List<HobbyCode> target = new ArrayList<HobbyCode>();
            for (String s: stringList) {
                target.add(HobbyCode.valueOf(s.toUpperCase()));
            }
            return target;
        }
    }
    */
}
