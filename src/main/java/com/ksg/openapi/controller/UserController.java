package com.ksg.openapi.controller;

import ch.qos.logback.classic.Logger;
import com.ksg.openapi.common.HobbyType;
import com.ksg.openapi.dto.UserDTO;
import com.ksg.openapi.service.UserService;
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
    public ResponseEntity user(@RequestParam String name,
                               @RequestParam HobbyType hobby) throws Exception {

        UserDTO userDTO = new UserDTO();
        userDTO.setName(name);
        userDTO.setHobby(hobby);

        logger.debug("req param {}", userDTO.toString());

        return new ResponseEntity(userService.addUser(userDTO), HttpStatus.OK);
    }
}
