package com.ksg.openapi.controller;

import com.ksg.openapi.common.code.ErrorCode;
import com.ksg.openapi.dto.ResponseDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by 강성근
 */
@Controller
public class GlobalErrorController implements ErrorController {

    private static final String ERROR_PATH = "/error";

    @Override
    public String getErrorPath() {
        return ERROR_PATH;
    }

    @RequestMapping("/error")
    public ResponseEntity<?> errorHandler(HttpServletRequest request) {

        ResponseDTO response = new ResponseDTO(ErrorCode.NOT_FOUND);

        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }
}
