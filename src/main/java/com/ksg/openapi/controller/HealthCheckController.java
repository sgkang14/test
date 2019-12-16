package com.ksg.openapi.controller;

/**
 * Created by 강성근
 */
import ch.qos.logback.classic.Logger;
import com.ksg.openapi.dto.HealthCheckReqDTO;
import com.ksg.openapi.model.HealthCheckModel;
import com.ksg.openapi.service.HealthCheckService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    static final Logger logger = (Logger) LoggerFactory.getLogger(HealthCheckController.class);

    @Autowired
    HealthCheckService healthCheckService;

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "healthcheck", method = RequestMethod.GET)
    public HealthCheckModel healthCheck(@ModelAttribute HealthCheckReqDTO param) throws Exception {

        logger.debug("healthCheck start");

        HealthCheckModel hcm;

        logger.debug("service before");

        hcm = healthCheckService.getHealthCheck();

        logger.debug("service after");

        return hcm;
    }
}
