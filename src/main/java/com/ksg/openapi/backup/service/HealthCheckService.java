package com.ksg.openapi.backup.service;

import ch.qos.logback.classic.Logger;
import com.ksg.openapi.backup.common.ErrorCode;
import com.ksg.openapi.exception.CustomErrorException;
import com.ksg.openapi.backup.model.HealthCheckModel;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by 강성근
 */
@Service
public class HealthCheckService {

    private static Logger logger = (Logger) LoggerFactory.getLogger(HealthCheckService.class);

    public HealthCheckModel getHealthCheck() {
        HealthCheckModel healthCheckModel = new HealthCheckModel();
        healthCheckModel.setMessage("it's ok");
/*      if (false) {
            logger.debug("throw exception before");

 //           throw new CustomErrorException(ErrorCode.NOT_FOUND);

        }
*/
        logger.debug("throw exception after");

        return healthCheckModel;
    }
}
