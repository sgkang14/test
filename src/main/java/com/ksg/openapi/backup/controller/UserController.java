package com.ksg.openapi.backup.controller;

import ch.qos.logback.classic.Logger;
import com.ksg.openapi.backup.dto.UserDTO;
import com.ksg.openapi.backup.service.UserService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by 강성근
 */
@RestController
public class UserController {

    static final Logger logger = (Logger) LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;

    @RequestMapping(value = "user", method = RequestMethod.GET)
    public ResponseEntity user(@ModelAttribute UserDTO userDTO) throws Exception {

        logger.debug("req param {}", userDTO.toString());

        return new ResponseEntity(userService.addUser(userDTO), HttpStatus.OK);
    }
}
