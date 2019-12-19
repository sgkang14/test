package com.ksg.openapi.exception;

import ch.qos.logback.classic.Logger;
import com.ksg.openapi.sample.errorResponse.ErrorCode;
import com.ksg.openapi.sample.errorResponse.ResponseDTO;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
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
    public ResponseEntity responseCustomError(CustomErrorException e) {

        logger.debug("### ExceptionHandler(custom): [{}]", e.getClass().getSimpleName());

        return new ResponseEntity<>(
                new ResponseDTO(e.getErrorCode())
                , HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler({
            MethodArgumentTypeMismatchException.class
            , BindException.class /* parameter validation */
    })
    public ResponseEntity responseIllegalArgumentError(MethodArgumentTypeMismatchException e) {

        logger.debug("### ExceptionHandler(unknown): [{}]", e.getClass().getSimpleName());

        return new ResponseEntity<>(
                new ResponseDTO(ErrorCode.INVALID_PARAM)
                , HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity responseDefaultError(Exception e) {

        logger.debug("### responseDefaultError(default): [{}]", e.getClass().getSimpleName());

        return new ResponseEntity<>(
                new ResponseDTO(ErrorCode.INTERAL_SERVER_ERROR)
                , HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
