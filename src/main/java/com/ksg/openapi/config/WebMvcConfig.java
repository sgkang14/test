package com.ksg.openapi.config;

import com.ksg.openapi.support.converter.StringToEnumConverterFactory;
import com.ksg.openapi.support.intercepter.AuthenticationIntercepter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.FixedLocaleResolver;

import java.util.Locale;

/**
 * Created by 강성근
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Autowired
    AuthenticationIntercepter authenticationIntercepter;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(authenticationIntercepter)
                .addPathPatterns("/*");
    }

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverterFactory(new StringToEnumConverterFactory());
    }

    @Bean
    public FixedLocaleResolver localeResolver() {

        FixedLocaleResolver fixedLocaleResolver = new FixedLocaleResolver();
        fixedLocaleResolver.setDefaultLocale(Locale.ENGLISH);
        return fixedLocaleResolver;
    }
}
