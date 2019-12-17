package com.ksg.openapi.backup.config;

import com.ksg.openapi.backup.common.HobbyTypeConverter;
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
        registry.addConverter(new HobbyTypeConverter());
    }
}
