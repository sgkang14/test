package com.ksg.openapi.backup.service;

import ch.qos.logback.classic.Logger;
import com.ksg.openapi.backup.dto.UserDTO;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by 강성근
 */
@Service
public class UserService {

    private static Logger logger = (Logger) LoggerFactory.getLogger(UserService.class);

    public UserDTO addUser(UserDTO userDTO) {

        return userDTO;
    }
}
