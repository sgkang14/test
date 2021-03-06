package com.ksg.openapi.support;

import ch.qos.logback.classic.Logger;
import com.ksg.openapi.common.code.ErrorCode;
import com.ksg.openapi.common.exception.CustomErrorException;
import com.ksg.openapi.dto.ResponseDTO;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

/**
 * Created by 강성근
 */
@ControllerAdvice
@Order(Ordered.HIGHEST_PRECEDENCE)
public class ControllerExceptionAdvisor {

    static final Logger logger = (Logger) LoggerFactory.getLogger(ControllerExceptionAdvisor.class);

    @ExceptionHandler(CustomErrorException.class)
    public ResponseEntity<ResponseDTO> responseCustomError(CustomErrorException e) {

        logger.debug("### ExceptionHandler(custom): [{}]", e.getClass().getSimpleName());

        return new ResponseEntity<ResponseDTO>(
                new ResponseDTO(e.getErrorCode(), e.getErrorCause())
                , HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler({
            MethodArgumentTypeMismatchException.class
            , MethodArgumentNotValidException.class
    })
    public ResponseEntity<ResponseDTO> responseIllegalArgumentError(Exception e) {

        logger.debug("### validation exception(): [{}] [{}]", e.getClass().getName(), e.getMessage());

        ResponseDTO response = new ResponseDTO(ErrorCode.INVALID_PARAM);

        return new ResponseEntity<ResponseDTO>(response, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(BindException.class)
    public ResponseEntity<ResponseDTO> responseIllegalArgumentError(BindException e) {

        logger.debug("### validation exception(): [{}] [{}]", e.getClass().getName(), e.getMessage());

        String cause;
        if (e.getBindingResult().getFieldError().getRejectedValue() != null) {
            cause = "invalid parameter " + e.getBindingResult().getFieldError().getField() + "=" + e.getBindingResult().getFieldError().getRejectedValue();
        } else {
            cause = "parameter " + e.getBindingResult().getFieldError().getField() + " " + e.getBindingResult().getFieldError().getDefaultMessage();
        }

        ResponseDTO response = new ResponseDTO(ErrorCode.INVALID_PARAM, cause);

        return new ResponseEntity<ResponseDTO>(response, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ResponseDTO> responseDefaultError(Exception e) {

        logger.debug("### responseDefaultError(default): [{}]", e.getClass().getSimpleName());

        ResponseDTO<String> response = new ResponseDTO<String>(ErrorCode.INTERNAL_SERVER_ERROR, e.getMessage());

        logger.debug("### Error [{}] [{}]", response.getError().getCode(), response.getError().getMessage());

        return new ResponseEntity<ResponseDTO>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
