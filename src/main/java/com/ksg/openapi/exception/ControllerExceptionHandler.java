package com.ksg.openapi.exception;

import ch.qos.logback.classic.Logger;
import com.ksg.openapi.common.ErrorCode;
import com.ksg.openapi.dto.CommonFailResDTO;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

/**
 * Created by 강성근
 */
@RestControllerAdvice
@Order(Ordered.HIGHEST_PRECEDENCE)
public class ControllerExceptionHandler {

    static final Logger logger = (Logger) LoggerFactory.getLogger(ControllerExceptionHandler.class);

    @ExceptionHandler(CustomErrorException.class)
    public CommonFailResDTO responseCustomError(CustomErrorException e) {
        e.printStackTrace();

        return new CommonFailResDTO(ErrorCode.NOT_FOUND_PARAM);
    }

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public CommonFailResDTO responseIllegalArgumentError(MethodArgumentTypeMismatchException e) {
        e.printStackTrace();

        return new CommonFailResDTO(ErrorCode.INVALID_PARAM);
    }

    @ExceptionHandler(Exception.class)
    public CommonFailResDTO responseDefaultError(Exception e) {

        e.printStackTrace();
       return new CommonFailResDTO(ErrorCode.INTERAL_SERVER_ERROR);
    }
}
