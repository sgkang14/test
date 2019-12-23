package com.ksg.openapi.config;

import com.ksg.openapi.sample.errorResponse.HobbyType;
import com.ksg.openapi.sample.errorResponse.SexType;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by 강성근
 */
@Configuration
public class ConvertConfig implements WebMvcConfigurer {
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new HobbyType.StringToEnum());
        registry.addConverter(new HobbyType.StringToListEnum());
        registry.addConverter(new SexType.StringToEnum());
    }
}
