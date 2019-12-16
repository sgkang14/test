package com.ksg.openapi.service;

import ch.qos.logback.classic.Logger;
import com.ksg.openapi.dto.UserDTO;
import com.ksg.openapi.dto.ValidAndConvertDTO;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by 강성근
 */
@Service
public class ValidAndConvertService {

    private static Logger logger = (Logger) LoggerFactory.getLogger(ValidAndConvertService.class);

    public ValidAndConvertDTO go(ValidAndConvertDTO validAndConvertDTO) {

        return validAndConvertDTO;
    }
}
