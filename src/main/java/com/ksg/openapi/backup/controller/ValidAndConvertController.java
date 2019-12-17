package com.ksg.openapi.backup.controller;

import ch.qos.logback.classic.Logger;
import com.ksg.openapi.backup.dto.ValidAndConvertDTO;
import com.ksg.openapi.backup.service.ValidAndConvertService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by 강성근
 */
@RestController
public class ValidAndConvertController {

    static final Logger logger = (Logger) LoggerFactory.getLogger(ValidAndConvertController.class);

    @Autowired
    ValidAndConvertService validAndConvertService;

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public ResponseEntity validandconvert(@ModelAttribute @Valid ValidAndConvertDTO param) throws Exception {

        logger.debug("req param {}", param.toString());

        //param.validAndConvert();

        logger.debug("req param {}", param.toString());

        return new ResponseEntity(validAndConvertService.go(param), HttpStatus.OK);
    }
}
