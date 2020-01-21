package com.ksg.openapi.support.intercepter;

import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by 강성근
 */
@Component
public class AuthenticationIntercepter extends HandlerInterceptorAdapter {

    private static Logger logger = (Logger) LoggerFactory.getLogger(AuthenticationIntercepter.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        try {
            logger.debug("### AuthenticationIntercepter : AuthToken[{}]", request.getHeader("Auth-Token"));
            return true;

        } catch (Exception e) {
            logger.debug("### AuthenticationIntercepter : getHeader fail");
            return false;
        }
    }
}
