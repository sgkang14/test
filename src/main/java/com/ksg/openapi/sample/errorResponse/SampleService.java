package com.ksg.openapi.sample.errorResponse;

import ch.qos.logback.classic.Logger;
import com.ksg.openapi.backup.service.HealthCheckService;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by 강성근
 */
@Service
public class SampleService {

    private static Logger logger = (Logger) LoggerFactory.getLogger(SampleRequestDTO.class);

    public SampleResponseDTO query(SampleRequestDTO request) {

        logger.debug("### Service ### [{}]", request.toString());

        SampleResponseDTO<ResultVO> response = new SampleResponseDTO(new ResultVO(request));

        return response;
    }
}
