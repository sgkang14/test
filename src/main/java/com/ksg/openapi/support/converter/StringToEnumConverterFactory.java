package com.ksg.openapi.support.converter;

import com.ksg.openapi.common.code.EnumCode;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;

/**
 * Created by 강성근
 */
public class StringToEnumConverterFactory implements ConverterFactory<String, EnumCode> {

    private static class StringToEnumConverter<T extends EnumCode>
            implements Converter<String, T> {

        private Class<T> enumType;

        public StringToEnumConverter(Class<T> enumType) {
            this.enumType = enumType;
        }

        public T convert(String source) {

            final T[] enumConstants = enumType.getEnumConstants();

            for (final T enumConstant : enumConstants) {
                if (enumConstant.getName().equals( source )) {
                    return enumConstant;
                }
            }
            return null;
//            return (T) Enum.valueOf(this.enumType, source.trim().toUpperCase());
        }
    }

    @Override
    public <T extends EnumCode> Converter<String, T> getConverter(
            Class<T> targetType) {
        return new StringToEnumConverter(targetType);
    }
}
