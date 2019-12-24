package com.ksg.openapi.exception;

import ch.qos.logback.classic.Logger;
import com.ksg.openapi.sample.errorResponse.ErrorCode;
import com.ksg.openapi.sample.errorResponse.ResponseDTO;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

/**
 * Created by 강성근
 */
@ControllerAdvice
@Order(Ordered.HIGHEST_PRECEDENCE)
public class ControllerExceptionHandler {

    static final Logger logger = (Logger) LoggerFactory.getLogger(ControllerExceptionHandler.class);

    @ExceptionHandler(CustomErrorException.class)
    public ResponseEntity<ResponseDTO> responseCustomError(CustomErrorException e) {

        logger.debug("### ExceptionHandler(custom): [{}]", e.getClass().getSimpleName());

        return new ResponseEntity<ResponseDTO>(
                new ResponseDTO(e.getErrorCode())
                , HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(/*{
            MethodArgumentTypeMismatchException.class
            , BindException.class
            , HttpMessageNotReadableException.class
            , */MethodArgumentNotValidException.class/*
    }*/)
    public ResponseEntity<ResponseDTO> responseIllegalArgumentError(Exception e) {

        logger.debug("### ExceptionHandler(unknown): [{}]", e.getClass().getSimpleName());

        ResponseDTO response = new ResponseDTO(ErrorCode.INVALID_PARAM);

        return new ResponseEntity<ResponseDTO>(response, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ResponseDTO> responseDefaultError(Exception e) {

        logger.debug("### responseDefaultError(default): [{}]", e.getClass().getSimpleName());

        return new ResponseEntity<ResponseDTO>(
                new ResponseDTO(ErrorCode.INTERNAL_SERVER_ERROR)
                , HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
