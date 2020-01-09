package com.ksg.openapi.controller;

import ch.qos.logback.classic.Logger;
import com.ksg.openapi.dto.ResponseDTO;
import com.ksg.openapi.dto.SampleRequestDTO;
import com.ksg.openapi.dto.SampleResponseData;
import com.ksg.openapi.service.SampleService;
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
public class SampleController {

    static final Logger logger = (Logger) LoggerFactory.getLogger(SampleController.class);

    @Autowired
    SampleService sampleService;

    @RequestMapping(value = "user", method = RequestMethod.GET)
    public ResponseEntity<ResponseDTO> errorResponseGet(@Valid SampleRequestDTO request) throws Exception {

        //logger.debug("### Controller ### [{}]", request.toString());

        ResponseDTO<SampleResponseData> response = new ResponseDTO<SampleResponseData>();
        response.setData(sampleService.query(request));

        return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);
    }

    @RequestMapping(value = "user", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<ResponseDTO> errorResponsePost(@Valid @RequestBody SampleRequestDTO request) throws Exception {

        logger.debug("### Controller ### [{}]", request.toString());

        ResponseDTO<SampleResponseData> response = new ResponseDTO<SampleResponseData>();
        response.setData(sampleService.query(request));

        return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);
    }
}