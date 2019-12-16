package com.ksg.openapi.aspect;

import ch.qos.logback.classic.Logger;
import com.ksg.openapi.common.ErrorCode;
import com.ksg.openapi.exception.CustomErrorException;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by 강성근
 */
@Aspect
@Component
public class MethodLoggerAspect {

    private static final Logger logger = (Logger) LoggerFactory.getLogger(MethodLoggerAspect.class);

    @Before("execution(* com.ksg.openapi.controller.*.*(..))")
    public void loggingMethodStart(JoinPoint joinPoint) {
        //logger.info("### ASPECT LOGGER ### start {} controller", joinPoint.getSignature().getName());

    }

    @After("execution(* com.ksg.openapi.controller.*.*(..))")
    public void loggingMethodEnd(JoinPoint joinPoint) {
        logger.info("### ASPECT LOGGER ### end {} controller", joinPoint.getSignature().getName());

    }
}
