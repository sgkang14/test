package com.ksg.openapi.sample.errorResponse;

import ch.qos.logback.classic.Logger;
import com.ksg.openapi.backup.controller.HealthCheckController;
import com.ksg.openapi.backup.dto.HealthCheckReqDTO;
import com.ksg.openapi.backup.model.HealthCheckModel;
import com.ksg.openapi.backup.service.HealthCheckService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 강성근
 */
@RestController
public class SampleController {

    static final Logger logger = (Logger) LoggerFactory.getLogger(SampleController.class);

    @Autowired
    SampleService sampleService;

    @RequestMapping(value = "errorResponse", method = RequestMethod.GET)
    public ResponseEntity errorResponse(@ModelAttribute SampleRequestDTO request) throws Exception {

        logger.debug("### Controller ### [{}]", request.toString());

        return new ResponseEntity(sampleService.query(request), HttpStatus.OK);
    }
}
