package com.ksg.openapi.exception;

import ch.qos.logback.classic.Logger;
import com.ksg.openapi.backup.dto.CommonFailResDTO;
import com.ksg.openapi.sample.errorResponse.ErrorCode;
import com.ksg.openapi.sample.errorResponse.SampleResponseDTO;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

        e.printStackTrace();

        return new ResponseEntity(
                new SampleResponseDTO(e.getErrorCode())
                , HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity responseIllegalArgumentError(MethodArgumentTypeMismatchException e) {

        e.printStackTrace();

        return new ResponseEntity(
                new SampleResponseDTO(ErrorCode.NOT_FOUND)
                , HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity responseDefaultError(Exception e) {

        e.printStackTrace();

        return new ResponseEntity(
                new SampleResponseDTO(ErrorCode.INTERAL_SERVER_ERROR)
                , HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
