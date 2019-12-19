package com.ksg.openapi.sample.errorResponse;

import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Created by 강성근
 */
@RestController
public class SampleController {

    static final Logger logger = (Logger) LoggerFactory.getLogger(SampleController.class);

    @Autowired
    SampleService sampleService;

    @RequestMapping(value = "errorResponseGet", method = RequestMethod.GET)
    public ResponseEntity<ResponseDTO> errorResponseGet(@ModelAttribute @Valid SampleRequestDTO request) throws Exception {

        logger.debug("### Controller ### [{}]", request.toString());

        return new ResponseEntity<ResponseDTO>(new ResponseDTO<SampleResponseData>(sampleService.query(request)), HttpStatus.OK);
    }

    @RequestMapping(value = "errorResponsePost", method = RequestMethod.POST)
    public ResponseEntity<ResponseDTO> errorResponsePost(@ModelAttribute @Valid SampleRequestDTO request) throws Exception {

        logger.debug("### Controller ### [{}]", request.toString());

        return new ResponseEntity<ResponseDTO>(new ResponseDTO<SampleResponseData>(sampleService.byPass(request)), HttpStatus.OK);
    }
}
