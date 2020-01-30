package com.ksg.openapi.controller;

import ch.qos.logback.classic.Logger;
import com.ksg.openapi.common.code.HobbyCode;
import com.ksg.openapi.dto.ResponseDTO;
import com.ksg.openapi.dto.UserListRequestDTO;
import com.ksg.openapi.service.UserService;
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
public class UserController {

    static final Logger logger = (Logger) LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;

    @RequestMapping(value = "user/{userNo}", method = RequestMethod.GET)
    public ResponseEntity<?> errorResponseGet(@Valid UserListRequestDTO request) throws Exception {

        logger.debug("### Controller ### [{}]", request.toString());


        ResponseDTO response = new ResponseDTO();

        response.setData(userService.queryUserList(request));

        ResponseEntity entity = new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);

        logger.debug("### Controller ### [{}]", entity.toString());

        return entity;
    }

    @RequestMapping(value = "user", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<ResponseDTO> errorResponsePost(@Valid UserListRequestDTO request) throws Exception {

        logger.debug("### Controller ### [{}]", request.toString());

        ResponseDTO response = new ResponseDTO();

        response.setData(userService.queryUserList(request));

        return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);
    }

}
